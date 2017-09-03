package com.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.chess.exceptions.InvalidPositionInputException;

public class InvalidPositionInputExceptionTest {

	@Test(expected = InvalidPositionInputException.class)
	public void test() {
		System.err.println(new InvalidPositionInputException("hi"));
	}

}
