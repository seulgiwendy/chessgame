package com.chess.domain;

import java.util.ArrayList;

import com.chess.pieces.Piece;

public class Board {
	
	public static final String BLANK_LINE = "********";
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	ArrayList<Piece> pawns;
	ArrayList<Piece> whitePawns;
	ArrayList<Piece> blackPawns;

	public void add(Piece pawn) {
		if (pawns == null) {
			pawns = new ArrayList<>();
		}
		pawns.add(pawn);

	}

	public int size() {
		return this.pawns.size();
	}

	public Piece getPawn(int index) {

		return pawns.get(index);
	}

	public void initialize() {

		if (whitePawns == null) {
			whitePawns = new ArrayList<>();
		}

		if (blackPawns == null) {
			blackPawns = new ArrayList<>();
		}
		for (int i = 0; i < 8; i++) {
			whitePawns.add(new Piece(Piece.WHITE_STRING));
		}
		for (int i = 0; i < 8; i++) {
			blackPawns.add(new Piece(Piece.BLACK_STRING));
		}

	}

	public String getWhitePawnsResult() {
		StringBuffer resultBuffer = getPawnsRepresentation(new StringBuffer(), "white");

		return resultBuffer.toString();
	}

	public String getBlackPawnsResult() {
		StringBuffer resultBuffer = getPawnsRepresentation(new StringBuffer(), "black");

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
			/*if (i == 3) {
				break;
			}*/
			sbf.append(LINE_SEPARATOR);
		}
		for (Piece p : this.whitePawns) {
			sbf.append(p.getRepresentation());
		}
		sbf.append(LINE_SEPARATOR);
		sbf.append(BLANK_LINE);
		
		return sbf.toString();
	}

	private StringBuffer getPawnsRepresentation(StringBuffer buffer, String color) {
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
	
	

}
