package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.chess.pieces.Piece;
import com.chess.pieces.Piece.Color;
import com.chess.pieces.Piece.Type;

public class PieceTest {

	@Test
	public void create() {

		Piece black = Piece.createBlackPawn();
		Piece white = Piece.createWhitePawn();
		assertEquals("black", black.getColor());
		assertEquals("white", white.getColor());
		assertEquals(Piece.Type.PAWN.getBlackRepresentation(), black.getRepresentation());

	}

	@Test
	public void create_DEFAULT_CONSTRUCTOR() {
		Piece pawn = Piece.createWhitePawn();
		assertEquals(Piece.Color.WHITE.getColor(), pawn.getColor());
		assertEquals(Type.PAWN.getWhiteRepresentation(), pawn.getRepresentation());

	}

	@Test
	public void createPiece() {
		verifyPiece(Piece.createWhitePawn(), Piece.Color.WHITE.getColor(), Piece.Type.PAWN.getWhiteRepresentation());
		verifyPiece(Piece.createBlackPawn(), Piece.Color.BLACK.getColor(), Piece.Type.PAWN.getBlackRepresentation());
		verifyPiece(Piece.createWhiteRook(), Piece.Color.WHITE.getColor(), Piece.Type.ROOK.getWhiteRepresentation());
		verifyPiece(Piece.createWhiteKnight(), Piece.Color.WHITE.getColor(),
				Piece.Type.KNIGHT.getWhiteRepresentation());
		verifyPiece(Piece.createWhiteBishop(), Piece.Color.WHITE.getColor(),
				Piece.Type.BISHOP.getWhiteRepresentation());
		verifyPiece(Piece.createWhiteQueen(), Piece.Color.WHITE.getColor(), Piece.Type.QUEEN.getWhiteRepresentation());
		verifyPiece(Piece.createWhiteKing(), Piece.Color.WHITE.getColor(), Piece.Type.KING.getWhiteRepresentation());
		verifyPiece(Piece.createBlackRook(), Piece.Color.BLACK.getColor(), Piece.Type.ROOK.getBlackRepresentation());
		verifyPiece(Piece.createBlackKnight(), Piece.Color.BLACK.getColor(),
				Piece.Type.KNIGHT.getBlackRepresentation());
		verifyPiece(Piece.createBlackBishop(), Piece.Color.BLACK.getColor(),
				Piece.Type.BISHOP.getBlackRepresentation());
		verifyPiece(Piece.createBlackQueen(), Piece.Color.BLACK.getColor(), Piece.Type.QUEEN.getBlackRepresentation());
		verifyPiece(Piece.createBlackKing(), Piece.Color.BLACK.getColor(), Piece.Type.KING.getBlackRepresentation());
	}

	@Test
	public void colorCheck() {
		Piece black = Piece.createBlackBishop();
		Piece white = Piece.createWhiteBishop();

		assertTrue(black.isBlack());
		assertTrue(white.isWhite());
	}

	@Test
	public void getEnumRepresentation() {
		assertEquals('*', Type.BLANK.getRepresentation());
		assertEquals('p', Type.PAWN.getWhiteRepresentation());
		assertEquals('P', Type.PAWN.getBlackRepresentation());
	}

	@Test
	public void getBlankRepresentation() {
		Piece piece = Piece.createBlankPiece();
		assertEquals(Type.BLANK.getBlankRepresentation(), piece.getRepresentation());
	}

	@Test
	public void getPieceColor() {
		verifyPieceByColor(Piece.createWhitePawn(), Piece.createBlackPawn(), Type.PAWN);
		verifyPieceByColor(Piece.createWhiteBishop(), Piece.createBlackBishop(), Type.BISHOP);
	}

	@Test
	public void equals() {
		assertEquals(Piece.createBlackBishop(), Piece.createBlackBishop());

	}
	
	@Test
	public void getPointsByPiece() {
		assertEquals(Type.BISHOP.getPoint(), Piece.createBlackBishop().getPoints(), BoardTest.DELTA);
	}

	void verifyPiece(final Piece piece, final String color, final char representation) {
		// Piece pawn = new Piece(color, representation);
		assertEquals(color, piece.getColor());
		assertEquals(representation, piece.getRepresentation());
	}

	private void verifyPieceByColor(final Piece whitepiece, final Piece blackpiece, Type type) {

		assertTrue(whitepiece.isWhite());
		assertEquals(type, whitepiece.getType());

		assertTrue(blackpiece.isBlack());
		assertEquals(type, blackpiece.getType());
	}

}
