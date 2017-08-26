package com.wheejuni.chess.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.wheejuni.chess.domain.Board;
import com.wheejuni.chess.domain.Column;

public class ColumnTest {

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

}
