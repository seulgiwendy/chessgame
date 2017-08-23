package com.wheejuni.chess.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wheejuni.chess.domain.Board;
import com.wheejuni.chess.pieces.Pawn;

public class BoardTest {

	Board board;

	@Before
	public void setup() {
		board = new Board();
	}

	@Test
	public void init() {
		Board board = new Board();

		Pawn pawn = new Pawn(Pawn.WHITE_COLOR);
		board.add(pawn);
		Pawn blackpawn = new Pawn(Pawn.BLACK_COLOR);
		board.add(blackpawn);
		assertEquals(2, board.size());
		assertEquals(blackpawn, board.findBlackPawn(0));

	}

	@Test
	public void initialize() throws Exception {
		Board board = new Board();
		board.initialize();
		System.out.println(board.getCurrentBoardStatus());
	}
}
