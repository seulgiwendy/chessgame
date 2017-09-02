package com.chess.domain;

import java.util.ArrayList;

import com.chess.pieces.Pawn;

public class Board {

	ArrayList<Pawn> pawns;
	ArrayList<Pawn> whitePawns;
	ArrayList<Pawn> blackPawns;

	public void add(Pawn pawn) {
		if (pawns == null) {
			pawns = new ArrayList<>();
		}
		pawns.add(pawn);

	}

	public int size() {
		return this.pawns.size();
	}

	public Pawn getPawn(int index) {

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
			whitePawns.add(new Pawn(Pawn.WHITE_STRING));
		}
		for (int i = 0; i < 8; i++) {
			blackPawns.add(new Pawn(Pawn.BLACK_STRING));
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

	private StringBuffer getPawnsRepresentation(StringBuffer buffer, String color) {
		if (color.equals("white")) {
			for (Pawn p : whitePawns) {
				buffer.append(p.getRepresentation());
			}
			return buffer;
		}

		for (Pawn p : blackPawns) {
			buffer.append(p.getRepresentation());
		}

		return buffer;
	}

}
