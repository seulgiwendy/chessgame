package com.wheejuni.chess.domain.piecesfactory;

import com.wheejuni.chess.pieces.Piece;

public class BlackRookCreator implements PieceTypeFactory{

	@Override
	public Piece setNewPiece() {
		return new Piece(Piece.Color.BLACK, Piece.Type.ROOK);
	}
	

}
