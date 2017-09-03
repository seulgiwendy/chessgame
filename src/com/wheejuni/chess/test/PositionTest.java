package com.wheejuni.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wheejuni.chess.domain.Position;

public class PositionTest {

	@Test
	public void getColumnIndex() {
		Position pos = new Position("C8");
		assertEquals(2, pos.getRankIndex());
		assertEquals(7, pos.getColumnIndex());
	}

}
