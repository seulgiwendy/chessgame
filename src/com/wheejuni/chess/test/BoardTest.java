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
	
	private static final double DELTA = 0.1;
	
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
		Board board = makeDefaultGameBoard();
		System.out.println(board.getCurrentBoardStatus());
	}
	
	@Test
	public void getEqualPieces() {
		Board board = makeDefaultGameBoard();
		assertEquals(8, board.getPieceofColorandType(Type.PAWN_BLACK, Color.BLACK));
	}
	
	@Test
	public void putPiece() {
		Board board = makeEmptyBoard();
		Piece piece = new Piece(Color.BLACK, Type.KING);
		board.put(piece, new Position("C3"));
		//System.out.println(board.getCurrentBoardStatus());
	}
	
	@Test
	public void findPiece() {
		Board board = makeDefaultGameBoard();
		assertEquals(new Piece(Color.BLACK, Type.PAWN_BLACK), board.findPiece(new Position("B3")));
	}
	
	@Test
	public void calculatePoint() {
		Board board = makeEmptyBoard();
		board.put(new Piece(Color.BLACK, Type.ROOK), new Position("C8"));
		assertEquals(5, board.calculatePoint(), DELTA);
	}
	
	@Test
	public void calculatePointDouble() {
		Board board = makeEmptyBoard();
		board.put(new Piece(Color.BLACK, Type.KNIGHT), new Position("B8"));
		assertEquals(2.5, board.calculatePoint(), DELTA);
	}
	
	@Test
	public void calculateEntireGameBoard() {
		Board board = makeDefaultGameBoard();
		assertEquals(76.0, board.calculatePoint(), DELTA);
	}
	
	@Test
	public void calculateBlackPieces() {
		Board board = makeEmptyBoard();
		board.put(new Piece(Color.WHITE, Type.BISHOP), new Position("A8"));
		board.put(new Piece(Color.BLACK, Type.BISHOP), new Position("C3"));
		assertEquals(2.5, board.calculateBlackSidePoint(), DELTA);
	}
	
	Board makeEmptyBoard() {
		Board board = new Board();
		board.blankInitialize();
		return board;
	}
	
	Board makeDefaultGameBoard() {
		Board board = new Board();
		board.initialize();
		return board;
	}
}
