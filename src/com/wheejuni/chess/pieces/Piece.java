package com.wheejuni.chess.pieces;

@SuppressWarnings("unused")
public class Piece {

	public enum Color {
		BLACK('P'), WHITE('p'), BLANK('*');
		
		private char representation;
		Color(char representation){
			this.representation = representation;
		}
	}

	public enum Type {

		PAWN('p'), BISHOP('b'), QUEEN('q'), KING('k'), ROOK('r'), KNIGHT('h'), BLANK('#') ;

		private char representation;

		Type(char representation) {
			this.representation = representation;

		}
	}

	String color;
	char representation;

	public Piece(String color) {
		this.color = color;
	}

	public Piece(String color, Type type) {
		this.color = color;
		this.representation = type.representation;
		
	}

	public Piece() {
		this.color = "white";
	}

	public String getColor() {
		return this.color;
	}

	public char getRepresentation() {
		return this.representation;
	}

}
