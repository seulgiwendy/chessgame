package com.wheejuni.chess.domain.piecesfactory;

import com.wheejuni.chess.pieces.Piece;

public class WhiteKingCreator implements PieceTypeFactory{

	@Override
	public Piece setNewPiece() {
		return new Piece(Piece.Color.WHITE, Piece.Type.KING);
	}

}
