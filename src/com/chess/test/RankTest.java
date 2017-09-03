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

}
