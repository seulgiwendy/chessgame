package com.chess.domain;

import java.util.ArrayList;

import com.chess.pieces.Piece;
import static com.chess.utils.StringUtils.appendNewLine;

public class Board {

	public static final String BLANK_LINE = "********";
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	ArrayList<Piece> pieces;
	ArrayList<Piece> whitePawns;
	ArrayList<Piece> blackPawns;

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

		if (pieces == null) {
			pieces = new ArrayList<>();

		}

		if (whitePawns == null) {
			whitePawns = new ArrayList<>();
		}

		if (blackPawns == null) {
			blackPawns = new ArrayList<>();
		}
		pieces.add(Piece.createBlackRook());
		pieces.add(Piece.createBlackKnight());
		pieces.add(Piece.createBlackBishop());
		pieces.add(Piece.createBlackQueen());
		pieces.add(Piece.createBlackKing());
		pieces.add(Piece.createBlackBishop());
		pieces.add(Piece.createBlackKnight());
		pieces.add(Piece.createBlackRook());
		for (int i = 0; i < 8; i++) {
			blackPawns.add(Piece.createBlackPawn());
			pieces.add(Piece.createBlackPawn());
		}
		
		for (int i = 0; i < 32; i++) {
			pieces.add(Piece.createBlankPiece());
		}

		for (int i = 0; i < 8; i++) {
			whitePawns.add(Piece.createWhitePawn());
			pieces.add(Piece.createWhitePawn());
		}
		pieces.add(Piece.createWhiteRook());
		pieces.add(Piece.createWhiteKnight());
		pieces.add(Piece.createWhiteBishop());
		pieces.add(Piece.createWhiteQueen());
		pieces.add(Piece.createWhiteKing());
		pieces.add(Piece.createWhiteBishop());
		pieces.add(Piece.createWhiteKnight());
		pieces.add(Piece.createWhiteRook());

	}

	public String getWhitePawnsResult() {
		StringBuffer resultBuffer = getPiecesRepresentation(new StringBuffer(), "white");

		return resultBuffer.toString();
	}

	public String getBlackPawnsResult() {
		StringBuffer resultBuffer = getPiecesRepresentation(new StringBuffer(), "black");

		return resultBuffer.toString();
	}

	public String getBoardStatus() {
		StringBuffer sbf = new StringBuffer();
		sbf.append(BLANK_LINE);
		sbf.append(LINE_SEPARATOR);
		for (Piece p : this.blackPawns) {
			sbf.append(p.getRepresentation());
		}
		sbf.append(LINE_SEPARATOR);
		for (int i = 0; i < 4; i++) {
			sbf.append(BLANK_LINE);
			/*
			 * if (i == 3) { break; }
			 */
			sbf.append(LINE_SEPARATOR);
		}
		for (Piece p : this.whitePawns) {
			sbf.append(p.getRepresentation());
		}
		sbf.append(LINE_SEPARATOR);
		sbf.append(BLANK_LINE);

		return sbf.toString();
	}

	private StringBuffer getPiecesRepresentation(StringBuffer buffer, String color) {
		if (color.equals("white")) {
			for (Piece p : whitePawns) {
				buffer.append(p.getRepresentation());
			}
			return buffer;
		}

		for (Piece p : blackPawns) {
			buffer.append(p.getRepresentation());
		}

		return buffer;
	}

	public int pieceCount() {
		return pieces.size();
	}

	public String showBoard() {
		int index = 0;
		StringBuffer sbf = new StringBuffer();
		for (Piece p : pieces) {
			sbf.append(p.getRepresentation());
			index++;
			if (index % 8 == 0) {
				sbf.append(appendNewLine(""));
			}
		}
		
		
		return sbf.toString();
	}

}
