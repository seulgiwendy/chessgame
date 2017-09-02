package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.chess.domain.Board;
import com.chess.pieces.Pawn;

public class BoardTest {

	@Test
	public void test() {

		Board board = init();
		board.add(new Pawn());
		board.add(new Pawn(Pawn.BLACK_STRING));
		assertEquals(2, board.size());
		assertEquals("white", board.getPawn(0).getColor());
		assertEquals("black", board.getPawn(1).getColor());

	}
	
	@Test
	public void initialize() {
		Board board = init();
		board.initialize();
		assertEquals("PPPPPPPP", board.getWhitePawnsResult());
		assertEquals("pppppppp", board.getBlackPawnsResult());
		
	}
	
	

	private Board init() {

		return new Board();

	}

}
