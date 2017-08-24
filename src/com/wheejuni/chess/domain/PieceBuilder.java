package com.wheejuni.chess.domain;

import com.wheejuni.chess.domain.piecesfactory.PieceTypeFactory;
import com.wheejuni.chess.pieces.Piece;

public class PieceBuilder {
	
	private PieceTypeFactory ptf;
	
	public void setPieceType(PieceTypeFactory ptf) {
		this.ptf = ptf;
		
	}
	
	public Piece buildPiece() {
		return ptf.setNewPiece();
	}

}
