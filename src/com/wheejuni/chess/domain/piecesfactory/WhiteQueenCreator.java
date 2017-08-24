package com.wheejuni.chess.domain.piecesfactory;

import com.wheejuni.chess.pieces.Piece;

public class WhiteQueenCreator implements PieceTypeFactory {

	@Override
	public Piece setNewPiece() {
		return new Piece(Piece.Color.WHITE, Piece.Type.QUEEN);
	}

}
