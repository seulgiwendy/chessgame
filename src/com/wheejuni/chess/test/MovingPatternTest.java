package com.wheejuni.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wheejuni.chess.domain.MovingPattern;

public class MovingPatternTest {

	@Test
	public void test() {
		MovingPattern move = new MovingPattern();
		assertTrue(move.isMovable());
	}

}
