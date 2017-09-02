package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.chess.pieces.Pawn;

@SuppressWarnings("deprecation")
public class PawnTest {

	@Test
	public void create() {
		String blackString = "black";
		String whiteString = "white";
		
		
		Pawn pawn = new Pawn();
		Pawn black = new Pawn(blackString);
		Pawn white = new Pawn(whiteString);
		assertEquals("black", black.getColor());
		assertEquals("white", white.getColor());
		
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

}
