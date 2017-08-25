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

	public Piece(Color color) {
		this.color = color.getColor();
		if (color.getColor().equals("white")) {
			this.representation = Type.PAWN_WHITE.getRepresentation();
			return;
		}
		this.representation = Type.PAWN_BLACK.getRepresentation();

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + representation;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (representation != other.representation)
			return false;
		return true;
	}
	
	

}
