package com.wheejuni.chess.pieces;

public class Piece {

	public enum Color {
		BLACK("black"), WHITE("white"), BLANK("blank");

		private String color;

		Color(String color) {
			this.color = color;
		}

		public String getColor() {
			return this.color;

		}

	}

	public enum Type {

		PAWN_WHITE('p'), PAWN_BLACK('P'), BISHOP('b'), QUEEN('q'), KING('k'), ROOK('r'), KNIGHT('h'), BLANK('#');

		private char representation;

		Type(char representation) {
			this.representation = representation;

		}
		
		public char getRepresentation() {
			return this.representation;
		}
	}

	String color;
	char representation;

	public Piece(String color) {
		this.color = color;
	}

	public Piece(Color color, Type type) {
		this.color = color.getColor();
		this.representation = type.getRepresentation();

	}

	public Piece() {
		this.color = Piece.Color.WHITE.getColor();
		this.representation = Piece.Type.PAWN_WHITE.getRepresentation();
	}

	public String getColor() {
		return this.color;
	}

	public char getRepresentation() {
		return this.representation;
	}

}
