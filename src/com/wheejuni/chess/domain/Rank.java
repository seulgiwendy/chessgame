package com.wheejuni.chess.domain;

import java.util.ArrayList;

import com.wheejuni.chess.pieces.Pawn;

public class Rank {

	private ArrayList<Pawn> row = new ArrayList<>();

	public void addPawn(Pawn pawn) {
		row.add(pawn);
	}

	public void whiteInitialize() {
		for (int i = 0; i < 8; i++) {
			row.add(new Pawn(Pawn.WHITE_COLOR, Pawn.WHITE_REPRESENTATION));
		}
	}

	public void blackInitialize() {
		for (int i = 0; i < 8; i++) {
			row.add(new Pawn(Pawn.BLACK_COLOR, Pawn.BLACK_REPRESENTATION));
		}
	}
	
	public void blankInitialize() {
		
		for (int i = 0; i < 8; i++) {
			row.add(new Pawn(Pawn.BLANK_LABEL, Pawn.BLANK_REPRESENTATION));
		}
		
		
	}
	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
		
		for (int i = 0; i < this.row.size(); i++) {
			sbf.append(this.row.get(i).getRepresentation());
		}
		
		return sbf.toString();
	}

}
