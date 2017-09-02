package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.chess.pieces.Piece;

public class PawnTest {
	

	@Test
	public void create() {
		
		
		Piece black = new Piece(Piece.BLACK_STRING);
		Piece white = new Piece(Piece.WHITE_STRING);
		assertEquals("black", black.getColor());
		assertEquals("white", white.getColor());
		assertEquals(Piece.BLACK_REPRESENTATION, black.getRepresentation());
		
	}
	
	@Test
	public void create_DEFAULT_CONSTRUCTOR() {
		Piece pawn = new Piece();
		assertEquals(Piece.WHITE_STRING, pawn.getColor());
		assertEquals(Piece.WHITE_REPRESENTATION, pawn.getRepresentation());
		
	}
	
	@Test
	public void getBlack() {
		Piece pawn = new Piece();
		pawn.setColor("black");
		assertEquals("black", pawn.getColor());
	}
	
	@Test
	public void pawnConstructor() {
		Piece pawn = new Piece("white");
		assertEquals("white", pawn.getColor());
	}
	
	@Test
	public void verifyPawnTest() {
		verifyPawn("white", Piece.WHITE_REPRESENTATION);
	}
	
	void verifyPawn(final String color, final char representation) {
		Piece pawn = new Piece(color, representation);
		assertEquals(representation, pawn.getRepresentation());
	}

}
