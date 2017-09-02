package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.chess.pieces.Pawn;

public class PawnTest {
	

	@Test
	public void create() {
		
		
		Pawn black = new Pawn(Pawn.BLACK_STRING);
		Pawn white = new Pawn(Pawn.WHITE_STRING);
		assertEquals("black", black.getColor());
		assertEquals("white", white.getColor());
		assertEquals(Pawn.BLACK_REPRESENTATION, black.getRepresentation());
		
	}
	
	@Test
	public void create_DEFAULT_CONSTRUCTOR() {
		Pawn pawn = new Pawn();
		assertEquals(Pawn.WHITE_STRING, pawn.getColor());
		assertEquals(Pawn.WHITE_REPRESENTATION, pawn.getRepresentation());
		
	}
	
	@Test
	public void getBlack() {
		Pawn pawn = new Pawn();
		pawn.setColor("black");
		assertEquals("black", pawn.getColor());
	}
	
	@Test
	public void pawnConstructor() {
		Pawn pawn = new Pawn("white");
		assertEquals("white", pawn.getColor());
	}
	
	@Test
	public void verifyPawnTest() {
		verifyPawn("white", Pawn.WHITE_REPRESENTATION);
	}
	
	void verifyPawn(final String color, final char representation) {
		Pawn pawn = new Pawn(color, representation);
		assertEquals(representation, pawn.getRepresentation());
	}

}
