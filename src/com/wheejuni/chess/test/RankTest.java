package com.wheejuni.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wheejuni.chess.domain.Rank;
import com.wheejuni.chess.pieces.Piece;
import com.wheejuni.chess.pieces.Piece.Color;
import com.wheejuni.chess.pieces.Piece.Type;

public class RankTest {
	
	private static final double DELTA = 0.1;
	

	@Test
	public void calculatePoints() {
		
		Rank rank = setTestableRank();
		rank.addPiece(new Piece(Color.BLACK, Type.KNIGHT));
		assertEquals(5.5, rank.calculatePoint(), DELTA);
	}
	
	@Test
	public void calculateBlackSidePoints() {
		Rank rank = setTestableRank();
		rank.addPiece(new Piece(Color.WHITE, Type.KNIGHT));
		rank.addPiece(new Piece(Color.BLACK, Type.KNIGHT));
		assertEquals(5.5, rank.calculateBlackSidePoint(), DELTA);
	}
	
	@Test
	public void calculateWhiteSidePoints() {
		Rank rank = setTestableRank();
		rank.addPiece(new Piece(Color.WHITE, Type.QUEEN));
		assertEquals(9.0, rank.calculateWhiteSidePoints(), DELTA);
	}

	Rank setTestableRank() {
		
		Rank rank = new Rank();
		rank.blankInitialize();
		rank.addPiece(new Piece(Color.BLACK, Type.BISHOP));
		return rank;
	}
	
	Rank setTestablePawnRank() {
		Rank rank = new Rank();
		rank.whiteInitialize();
		return rank;
	}
}
