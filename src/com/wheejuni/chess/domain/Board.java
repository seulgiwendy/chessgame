package com.wheejuni.chess.domain;

import java.util.ArrayList;

import com.wheejuni.chess.pieces.Piece;
import com.wheejuni.chess.pieces.Piece.Color;
import com.wheejuni.chess.pieces.Piece.Type;

public class Board {
	public static final String BLANK_SPACE = "*";
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	enum RowLetter {

		ROW_0("A"), ROW_1("B"), ROW_2("C"), ROW_3("D"), ROW_4("E"), ROW_5("F"), ROW_6("G"), ROW_7("H");

		private String symbol;

		RowLetter(String symbol) {
			this.symbol = symbol;
		}

		String getSymbol() {
			return this.symbol;
		}
	}

	private String currentBoard;
	private ArrayList<Piece> whitePawns;
	private ArrayList<Piece> blackPawns;
	private ArrayList<BoardTile> board;
	private ArrayList<Rank> row = new ArrayList<>();

	/*
	 * method "add" is not supported anymore. use put(Piece, Position) instead.
	 */

	@Deprecated
	public void add(Piece pawn) {

		if (whitePawns == null) {
			whitePawns = new ArrayList<>();
		}

		if (blackPawns == null) {
			blackPawns = new ArrayList<>();
		}

		if (pawn.getColor().equals("white")) {
			whitePawns.add(pawn);
		}
		if (pawn.getColor().equals("black")) {
			blackPawns.add(pawn);
		}

	}

	public int size() {
		return this.whitePawns.size() + this.blackPawns.size();
	}

	public Piece findWhitePawn(int position) {
		return this.whitePawns.get(position);
	}

	public Piece findBlackPawn(int position) {
		return this.blackPawns.get(position);
	}

	public void blankInitialize() {

		for (int i = 0; i < 8; i++) {
			Rank rank = new Rank();
			rank.blankInitialize();
			this.row.add(rank);
		}
	}

	public void initialize() {
		Rank rank = new Rank();
		rank.blankInitialize();
		Rank blackDefault = new Rank();
		blackDefault.defaultBlackRankSetInitialize();
		this.row.add(blackDefault);
		Rank black = new Rank();
		black.blackInitialize();
		this.row.add(black);

		for (int i = 2; i < 6; i++) {

			this.row.add(rank);

		}
		Rank white = new Rank();
		white.whiteInitialize();
		this.row.add(white);
		Rank whiteDefault = new Rank();
		whiteDefault.defaultWhiteRankSetInitialize();
		this.row.add(whiteDefault);

	}

	public String getWhitePawnsResult() {
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < whitePawns.size(); i++) {
			sbf.append(whitePawns.get(i).getRepresentation());
		}
		return sbf.toString();

	}

	public String getBlackPawnsResult() {

		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < blackPawns.size(); i++) {
			sbf.append(blackPawns.get(i).getRepresentation());
		}
		return sbf.toString();

	}

	public int getPieceofColorandType(Type type, Color color) {
		int count = 0;

		for (Rank ranks : row) {
			int temp = ranks.getEqualPieces(new Piece(color, type));
			count += temp;

		}

		return count;
	}

	public String getCurrentBoardStatus() {
		StringBuilder returnStringGenerator = new StringBuilder();

		for (Rank rows : row) {
			returnStringGenerator.append(rows.toString());
			returnStringGenerator.append(LINE_SEPARATOR);
		}
		return returnStringGenerator.toString();
	}

	public Piece findPiece(Position position) {
		return this.row.get(position.getRankIndex()).getPieceByPosition(position.getColumnIndex());
	}

	public void put(Piece piece, Position position) {
		Rank target = this.row.get(position.getRankIndex());

		target.addPieceByIndex(piece, position.getColumnIndex());
	}

	public double calculatePoint() {
		double result = 0.0;
		for (Rank rows : this.row) {
			result += rows.calculatePoint();
		}

		return result;
	}

	public double calculateBlackSidePoint() {
		double result = 0.0;
		
		for (Rank rows : this.row) {
			result += rows.calculateBlackSidePoint();

		}
		return result;
	}

	public double calculateWhiteSidePoints() {
		double result = 0.0;
		for (Rank rows : this.row) {
			result += rows.calculateWhiteSidePoints();
		}
		return result;
	}

	public ArrayList<Integer> getPawnsinSameColumn() {
		ArrayList<Integer> returnList = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			int count = 0;
			for (int j = 0; j < row.size(); j++) {
				count += row.get(j).getWhitePawnOnColumn(i);
			}
			returnList.add(count);
		}
		//System.out.println(count);
		return returnList;
		
	}

	public ArrayList<Rank> getRows() {
		return this.row;
	}

	public Column getColumn(int columnIndex) {
		ArrayList<Piece> pieces = new ArrayList<>();
		for (Rank rank : this.row) {
			pieces.add(rank.getPieceByPosition(columnIndex));
		}
		return new Column(pieces);
	}
	
	

}
