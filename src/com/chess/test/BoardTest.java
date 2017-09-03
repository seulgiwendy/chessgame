package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.chess.domain.Board;
import com.chess.domain.Position;
import com.chess.pieces.Piece;
import static com.chess.utils.StringUtils.appendNewLine;

public class BoardTest {

	private Board board;

	@Before
	public void setup() {
		board = new Board();
	}

	@Test
	public void create() throws Exception {
		board.initialize();
		assertEquals(64, board.pieceCount());
		System.out.println(board.showBoard());
		String blankRank = appendNewLine("********");
		assertEquals(appendNewLine("RNBQKBNR") + appendNewLine("PPPPPPPP") + blankRank + blankRank + blankRank
				+ blankRank + appendNewLine("pppppppp") + appendNewLine("rnbqkbnr"), board.showBoard());

	}

	@Test
	public void blankBoard() {
		board.blankInitialize();
		assertEquals(64, board.pieceCount());
		String blankRank = appendNewLine("********");
		assertEquals(blankRank + blankRank + blankRank + blankRank + blankRank + blankRank + blankRank + blankRank,
				board.showBoard());
	}

	@Test
	public void put() {
		board.blankInitialize();
		board.put(new Position("A3"), Piece.createBlackBishop());
		board.put(new Position("F6"), Piece.createWhiteKing());
		System.out.println(board.showBoard());
		assertEquals(Piece.createBlackBishop(), board.findPiece(new Position("A3")));
	}

	@Test
	public void move() {
		board.blankInitialize();
		board.put(new Position("C4"), Piece.createBlackBishop());
		board.move(new Position("C4"), new Position("D5"));
		assertEquals(Piece.createBlackBishop(), board.findPiece(new Position("D5")));
		assertEquals(Piece.createBlankPiece(), board.findPiece(new Position("C4")));
	}
}
