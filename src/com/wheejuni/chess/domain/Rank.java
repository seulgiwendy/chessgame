package com.wheejuni.chess.domain;

import java.util.ArrayList;

import com.wheejuni.chess.pieces.Piece;

public class Rank {

	private ArrayList<Piece> row = new ArrayList<>();

	public void addPawn(Piece pawn) {
		row.add(pawn);
	}

	public void whiteInitialize() {
		for (int i = 0; i < 8; i++) {
			row.add(new Piece(Piece.Color.WHITE, Piece.Type.PAWN_WHITE));
		}
	}

	public void blackInitialize() {
		for (int i = 0; i < 8; i++) {
			row.add(new Piece(Piece.Color.BLACK, Piece.Type.PAWN_BLACK));
		}
	}
	
	public void blankInitialize() {
		
		for (int i = 0; i < 8; i++) {
			row.add(new Piece(Piece.Color.BLANK, Piece.Type.BLANK));
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
