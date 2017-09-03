package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.chess.domain.Position;

public class PositionTest {

	Position pos;

	@Before
	public void setup() {
		pos = new Position();
	}

	@Test
	public void setRankIndex() {
		pos.setRankIndex(3);
		assertEquals(3, pos.getRankIndex());
	}
	
	@Test
	public void setConstructor() {
		Position po = new Position("A3");
		assertEquals(0, po.getColumnIndex());
		assertEquals(2, po.getRankIndex());
	}

}
