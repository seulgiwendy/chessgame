package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterTest {

	
	@Test
	public void whitespace() {
		assertTrue(Character.isWhitespace('\n'));
	}

}
