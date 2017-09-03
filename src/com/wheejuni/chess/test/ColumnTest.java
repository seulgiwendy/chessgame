package com.wheejuni.chess.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.wheejuni.chess.domain.Board;
import com.wheejuni.chess.domain.Column;
import com.wheejuni.chess.pieces.Piece;
import com.wheejuni.chess.pieces.Piece.Color;
import com.wheejuni.chess.pieces.Piece.Type;

public class ColumnTest {
	private static final double DELTA = 0.1;

	@Test
	public void init() {

		Column column = new Column(new ArrayList<>());
	}

	@Test
	public void initByBoard() {
		Board board = new Board();
		board.initialize();
		Column column = new Column(board, 1);
		assertEquals(8, column.getPiecesCount());
	}

	@Test
	public void getNonBlankPiecesCount() {
		Column column = getDefaultColumn();
		assertEquals(4, column.getNonBlankPiecesCount());
	}

	@Test
	public void getBlackPawnsCount() {
		Column column = getDefaultColumn();
		assertEquals(1, column.getBlackPawnsCount());
	}

	@Test
	public void getWhitePawnsCount() {
		Column column = getDefaultColumn();
		assertEquals(1, column.getWhitePanwsCount());
	}

	@Test
	public void getIdenticalPawnsCount() {
		Column column = getPawnsColumn();
		assertEquals(3, column.getIdenticalWhitePawnsCount());
	}
	
	@Test
	public void getIdenticalBlackPawnsCount() {
		Column column = getBlackPawnsColumn();
		assertEquals(3, column.getIdenticalBlackPawnsCount());
	}

	Board getDefaultBoard() {
		Board board = new Board();
		board.initialize();
		return board;
	}

	Column getDefaultColumn() {
		Board board = getDefaultBoard();
		Column column = new Column(board, 1);
		return column;
	}

	Column getPawnsColumn() {
		ArrayList<Piece> whitePawns = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			whitePawns.add(new Piece(Color.WHITE, Type.PAWN_WHITE));
		}
		return new Column(whitePawns);

	}
	
	Column getBlackPawnsColumn() {
		ArrayList<Piece> blackPawns = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			blackPawns.add(new Piece(Color.BLACK, Type.PAWN_BLACK));
		}
		return new Column(blackPawns);
	}

}
