package com.wheejuni.chess.pieces;

public class Pawn {
	
	public static final String WHITE_COLOR = "white";
	public static final String BLACK_COLOR = "black";
	public static final String BLANK_LABEL = "blank";
	public static final char WHITE_REPRESENTATION = 'p';
	public static final char BLACK_REPRESENTATION = 'P';
	public static final char BLANK_REPRESENTATION = '*';
	
	String color;
	char representation;

	public Pawn(String color) {
		this.color = color;
	}
	
	public Pawn(String color, char representation) {
		this.color = color;
		this.representation = representation;
	}
	
	public Pawn() {
		this.color = "white";
	}

	public String getColor() {
		return this.color;
	}
	
	public char getRepresentation() {
		if (this.color.equals(WHITE_COLOR)) {
			return WHITE_REPRESENTATION;
		}
		
		if (this.color.equals(BLANK_LABEL)) {
			return BLANK_REPRESENTATION;
		}
		return BLACK_REPRESENTATION;
	}
	
	

}
