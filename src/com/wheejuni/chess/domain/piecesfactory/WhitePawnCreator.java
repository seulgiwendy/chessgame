package com.wheejuni.chess.domain.piecesfactory;

import com.wheejuni.chess.pieces.Piece;

public class WhitePawnCreator implements PieceTypeFactory {

	@Override
	public Piece setNewPiece() {
		return new Piece(Piece.Color.WHITE, Piece.Type.PAWN_WHITE);
	}

}
