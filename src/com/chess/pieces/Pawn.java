package com.chess.pieces;

public class Pawn {
	
	private String color;
	
	
	@Deprecated
	public Pawn() {
		
	}
	
	public Pawn(String color) {
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
		
	}

	public String getColor() {
		return this.color;
	}

}
