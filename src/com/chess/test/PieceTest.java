package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.chess.pieces.Piece;

public class PieceTest {

	@Test
	public void create() {

		Piece black = Piece.createBlackPawn();
		Piece white = Piece.createWhitePawn();
		assertEquals("black", black.getColor());
		assertEquals("white", white.getColor());
		assertEquals(Piece.BLACK_PAWN_REPRESENTATION, black.getRepresentation());

	}

	@Test
	public void create_DEFAULT_CONSTRUCTOR() {
		Piece pawn = Piece.createWhitePawn();
		assertEquals(Piece.WHITE_STRING, pawn.getColor());
		assertEquals(Piece.WHITE_PAWN_REPRESENTATION, pawn.getRepresentation());

	}

	@Test
	public void createPiece() {
		verifyPiece(Piece.createWhitePawn(), Piece.WHITE_STRING, Piece.WHITE_PAWN_REPRESENTATION);
		verifyPiece(Piece.createBlackPawn(), Piece.BLACK_STRING, Piece.BLACK_PAWN_REPRESENTATION);
		verifyPiece(Piece.createWhiteRook(), Piece.WHITE_STRING, Piece.WHITE_ROOK_REPRESENTATION);
		verifyPiece(Piece.createWhiteKnight(), Piece.WHITE_STRING, Piece.WHITE_KNIGHT_REPRESENTATION);
		verifyPiece(Piece.createWhiteBishop(), Piece.WHITE_STRING, Piece.WHITE_BISHOP_REPRESENTATION);
		verifyPiece(Piece.createWhiteQueen(), Piece.WHITE_STRING, Piece.WHITE_QUEEN_REPRESENTATION);
		verifyPiece(Piece.createWhiteKing(), Piece.WHITE_STRING, Piece.WHITE_KING_REPRESENTATION);
		verifyPiece(Piece.createBlackRook(), Piece.BLACK_STRING, Piece.BLACK_ROOK_REPRESENTATION);
		verifyPiece(Piece.createBlackKnight(), Piece.BLACK_STRING, Piece.BLACK_KNIGHT_REPRESENTATION);
		verifyPiece(Piece.createBlackBishop(), Piece.BLACK_STRING, Piece.BLACK_BISHOP_REPRESENTATION);
		verifyPiece(Piece.createBlackQueen(), Piece.BLACK_STRING, Piece.BLACK_QUEEN_REPRESENTATION);
		verifyPiece(Piece.createBlackKing(), Piece.BLACK_STRING, Piece.BLACK_KING_REPRESENTATION);
	}
	
	@Test
	public void colorCheck() {
		Piece black = Piece.createBlackBishop();
		Piece white = Piece.createWhiteBishop();
		
		assertTrue(black.isBlack());
		assertTrue(white.isWhite());
	}

	void verifyPiece(final Piece piece, final String color, final char representation) {
		// Piece pawn = new Piece(color, representation);
		assertEquals(color, piece.getColor());
		assertEquals(representation, piece.getRepresentation());
	}

}
