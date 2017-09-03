package com.chess.exceptions;

public class InvalidPositionInputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3467797837008785491L;

	public InvalidPositionInputException(String message) {
		super(message);
	}

}
