package com.chess.domain;

import java.util.ArrayList;

import com.chess.pieces.Piece;
import com.chess.utils.StringUtils;

import static com.chess.utils.StringUtils.appendNewLine;

@SuppressWarnings("unused")
public class Board {

	public static final String BLANK_LINE = "********";
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	ArrayList<Piece> pieces;
	ArrayList<Piece> whitePawns;
	ArrayList<Piece> blackPawns;
	ArrayList<Rank> ranks;

	public void add(Piece pawn) {
		if (pieces == null) {
			pieces = new ArrayList<>();
		}
		pieces.add(pawn);

	}

	public int size() {
		return this.pieces.size();
	}

	public Piece getPawn(int index) {

		return pieces.get(index);
	}

	public void initialize() {
		ranks = new ArrayList<>();
		Rank blackDefaultRank = new Rank();
		Rank blackPawnRank = new Rank();
		Rank whiteDefaultRank = new Rank();
		Rank whitePawnRank = new Rank();

		blackDefaultRank.blackDefaultInitialize();
		ranks.add(blackDefaultRank);

		blackPawnRank.blackPawnInitialize();
		ranks.add(blackPawnRank);

		for (int i = 0; i < 4; i++) {
			Rank blankRank = new Rank();
			blankRank.blankInitialize();
			ranks.add(blankRank);
		}

		whitePawnRank.whitePawnInitialize();
		ranks.add(whitePawnRank);

		whiteDefaultRank.whiteDefaultInitialize();
		ranks.add(whiteDefaultRank);

	}

	public int pieceCount() {
		int count = 0;
		for (Rank r : ranks) {
			count += r.getPiecesCount();
		}

		return count;
	}

	public String showBoard() {
		int index = 0;
		StringBuffer sbf = new StringBuffer();
		for (Rank r : ranks) {
			sbf.append(r.toString());
			index++;
			sbf.append(StringUtils.appendNewLine(""));
		}

		return sbf.toString();
	}

	public void blankInitialize() {
		ranks = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Rank rank = new Rank();
			rank.blankInitialize();
			ranks.add(rank);
		}
	}

	public void put(Position position, Piece piece) {

		ranks.get(getRankIndexFromPosition(position)).addPieceByIndex(getColumnIndexFromPosition(position), piece);
	}

	public Piece findPiece(Position position) {

		return ranks.get(getRankIndexFromPosition(position)).getPiece(getColumnIndexFromPosition(position));

	}

	public void move(Position originPosition, Position destPosition) {
		Piece movingPiece = ranks.get(getRankIndexFromPosition(originPosition))
				.getPiece(getColumnIndexFromPosition(originPosition));
		put(originPosition, Piece.createBlankPiece());
		put(destPosition, movingPiece);

	}

	private int getRankIndexFromPosition(Position position) {
		return position.getRankIndex();
	}

	private int getColumnIndexFromPosition(Position position) {
		return position.getColumnIndex();
	}

	public double getBlackScore() {
		double points = 0;
		for (Rank r : ranks) {
			points += r.getBlackPoint();
		}

		return points;
	}

	public double getWhiteScore() {
		double points = 0;
		for (Rank r : ranks) {
			points += r.getWhitePoint();
		}

		return points;
	}

}
