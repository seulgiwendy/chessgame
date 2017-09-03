package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.chess.domain.Rank;
import com.chess.pieces.Piece;

public class RankTest {

	Rank rank;

	@Before
	public void setup() {
		rank = new Rank();
	}

	@Test
	public void getPieceByIndex() {
		rank.blackPawnInitialize();
		assertEquals(Piece.createBlackPawn(), rank.getPiece(0));
	}

	@Test
	public void getCount() {
		rank.blackPawnInitialize();
		assertEquals(8, rank.getPiecesCount());
	}

	@Test
	public void getWhiteCount() {
		rank.whitePawnInitialize();
		assertEquals(8, rank.getPiecesCount());
		assertEquals(Piece.createWhitePawn(), rank.getPiece(3));
	}

	@Test
	public void getWhiteDefault() {
		rank.whiteDefaultInitialize();
		assertEquals(Piece.createWhiteRook(), rank.getPiece(0));
	}

	@Test
	public void getBlackDefault() {
		rank.blackDefaultInitialize();
		assertEquals(Piece.createBlackBishop(), rank.getPiece(2));
	}

	@Test
	public void getStringofRank() {
		rank.whitePawnInitialize();
		assertEquals("pppppppp", rank.toString());
	}

	@Test
	public void getBlankRank() {
		rank.blankInitialize();
		assertEquals(Piece.createBlankPiece(), rank.getPiece(0));
	}

	@Test
	public void getPieceByEqualPiece() {
		rank.blackDefaultInitialize();
		assertEquals(2, rank.getEqualPiecesCount(Piece.createBlackBishop()));
	}

	@Test
	public void addPieceByIndex() {
		rank.blankInitialize();
		rank.addPieceByIndex(3, Piece.createBlackBishop());
		assertEquals(Piece.createBlackBishop(), rank.getPiece(3));
	}

	@Test
	public void getPointsBySide() {
		rank.blankInitialize();
		rank.addPieceByIndex(2, Piece.createBlackKnight());
		rank.addPieceByIndex(3, Piece.createBlackQueen());
		rank.addPieceByIndex(4, Piece.createWhiteBishop());
		assertEquals(11.5, rank.getBlackPoint(), BoardTest.DELTA);
	}

	@Test
	public void getPointsofWhites() {
		rank.blankInitialize();
		rank.addPieceByIndex(0, Piece.createWhiteBishop());
		rank.addPieceByIndex(2, Piece.createBlackKnight());
		rank.addPieceByIndex(5, Piece.createWhiteKnight());
		assertEquals(5.5, rank.getWhitePoint(), BoardTest.DELTA);
	}

	@Test
	public void getBlackPieces() {
		rank.blackDefaultInitialize();
		assertEquals(8, rank.getBlackPieces().size());
		assertEquals(Piece.createBlackQueen(), rank.getBlackPieces().get(0));
	}

	@Test
	public void getWhitePieces() {
		rank.whiteDefaultInitialize();
		assertEquals(8, rank.getWhitePieces().size());
	}

}
