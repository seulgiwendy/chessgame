package com.chess.exceptions;

public class UninitializedRankException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6913507330481610566L;
	public UninitializedRankException (String message) {
		super(message);
	}

}
