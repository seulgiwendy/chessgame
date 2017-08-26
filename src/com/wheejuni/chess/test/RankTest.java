package com.wheejuni.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wheejuni.chess.domain.Rank;
import com.wheejuni.chess.pieces.Piece;
import com.wheejuni.chess.pieces.Piece.Color;
import com.wheejuni.chess.pieces.Piece.Type;

public class RankTest {
	

	@Test
	public void calculatePoints() {
		
		Rank rank = setTestableRank();
		assertEquals(3,rank.calculatePoint());
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
