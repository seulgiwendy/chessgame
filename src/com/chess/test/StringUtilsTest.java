package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.chess.domain.Board;
import static com.chess.utils.StringUtils.appendNewLine;


public class StringUtilsTest {

	private static final String TEST_STRING = "빠빠빠 빨간맛~ 궁금해 허니~";
	
	@Test
	public void test() {
		
		assertEquals(TEST_STRING + Board.LINE_SEPARATOR, appendNewLine(TEST_STRING));
	}

}
