package com.chess.pieces;

public class Piece {
	
	public static final String WHITE_STRING = "white";
	public static final String BLACK_STRING = "black";
	public static final char WHITE_REPRESENTATION = 'P';
	public static final char BLACK_REPRESENTATION = 'p';
	
	
	private String color;
	private char representation;
	
	
	public Piece() {
		this.color = "white";
		
	}
	
	public Piece(String color) {
		this.color = color;
	}

	public Piece(String color, char representation) {
		this.color = color;
		this.representation = representation;
	}

	public void setColor(String color) {
		this.color = color;
		
	}

	public String getColor() {
		return this.color;
	}

	public char getRepresentation() {
		
		if (this.color.equals("white")) {
			return WHITE_REPRESENTATION;
		}
		
		if (this.color.equals("black")) {
			return BLACK_REPRESENTATION;
		}
		return this.representation;
	}

}
