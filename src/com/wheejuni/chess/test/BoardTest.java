package com.wheejuni.chess.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wheejuni.chess.domain.Board;
import com.wheejuni.chess.domain.Position;
import com.wheejuni.chess.pieces.Piece;
import com.wheejuni.chess.pieces.Piece.Color;
import com.wheejuni.chess.pieces.Piece.Type;

public class BoardTest {

	Board board;

	@Before
	public void setup() {
		board = new Board();
	}

	@Test
	public void init() {
		Board board = new Board();

		Piece pawn = new Piece(Piece.Color.WHITE);
		board.add(pawn);
		Piece blackpawn = new Piece(Piece.Color.BLACK);
		board.add(blackpawn);
		assertEquals(2, board.size());
		assertEquals(blackpawn, board.findBlackPawn(0));

	}

	@Test
	public void initialize() throws Exception {
		Board board = new Board();
		board.initialize();
		//System.out.println(board.getCurrentBoardStatus());
	}
	
	@Test
	public void getEqualPieces() {
		Board board = new Board();
		board.initialize();
		assertEquals(8, board.getPieceofColorandType(Type.PAWN_BLACK, Color.BLACK));
	}
	
	@Test
	public void putPiece() {
		Board board = new Board();
		board.blankInitialize();
		Piece piece = new Piece(Color.BLACK, Type.KING);
		board.put(piece, new Position("C5"));
		System.out.println(board.getCurrentBoardStatus());
	}
	
	@Test
	public void findPiece() {
		Board board = new Board();
		board.initialize();
		assertEquals(new Piece(Color.BLACK, Type.PAWN_BLACK), board.findPiece(new Position("B3")));
	}
}
