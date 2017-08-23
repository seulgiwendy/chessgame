package com.wheejuni.chess.domain;

import com.wheejuni.chess.pieces.Pawn;

public class BoardTile {

	private Pawn pawn;
	private int index;

	public BoardTile(int index) {
		this.index = index;
	}
	
	public BoardTile(int index, Pawn pawn) {
		this.index = index;
		this.pawn = pawn;
	}
	
	public Pawn getPawn() {
		return pawn;
	}

	public void setPawn(Pawn pawn) {
		this.pawn = pawn;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
		if (this.pawn == null) {
			sbf.append(Board.BLANK_SPACE);
		}
		sbf.append(this.pawn.getRepresentation());
		if (this.index % 8 == 0) {
			sbf.append("\n");
		}
		return sbf.toString();
	}

}
