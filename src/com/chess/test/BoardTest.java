package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.chess.domain.Board;
import com.chess.pieces.Piece;
import static com.chess.utils.StringUtils.appendNewLine;

public class BoardTest {
	
	private Board board;
	
	@Before
	public void setup() {
		board = new Board();
	}
	
	@Test
	public void create() throws Exception{
		board.initialize();
        assertEquals(64, board.pieceCount());
        String blankRank = appendNewLine("********");
        assertEquals(
            appendNewLine("RNBQKBNR") +
            appendNewLine("PPPPPPPP") +
            blankRank + blankRank + blankRank + blankRank +
            appendNewLine("pppppppp") +
            appendNewLine("rnbqkbnr"),
            board.showBoard());        
		
	}
	
	

	@Test
	public void initialize() {
		
		board.initialize();
		assertEquals("pppppppp", board.getWhitePawnsResult());
		assertEquals("PPPPPPPP", board.getBlackPawnsResult());
		System.out.println(board.getBoardStatus());

	}

	

}
