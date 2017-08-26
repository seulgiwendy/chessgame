package com.wheejuni.chess.pieces;

import com.wheejuni.chess.domain.Position;

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

		PAWN_WHITE('p', 1.0), PAWN_BLACK('P', 1.0), BISHOP('b', 3.0), QUEEN('q', 9.0), KING('k', 0.0), ROOK('r',
				5.0), KNIGHT('h', 2.5), BLANK('#', 0.0);

		private char representation;
		private double points;

		Type(char representation, double points) {
			this.representation = representation;
			this.points = points;

		}

		public char getRepresentation() {
			return this.representation;
		}

		public double getPoints() {
			return this.points;
		}
	}

	String color;
	char representation;
	double points;
	Position position;

	/*
	 * This constructor is used to create default Pawn piece with parameter "color".
	 * Use of Piece(Color, type:pawn) is strongly recommended.
	 */

	@Deprecated
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
		this.points = type.getPoints();

	}

	public Piece() {
		this.color = Piece.Color.WHITE.getColor();
		this.representation = Piece.Type.PAWN_WHITE.getRepresentation();
	}
	
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public String getPosition() {
		return this.position.getSymbol();
	}
	public int getColumnIndex() {
		return this.position.getColumnIndex();
	}
	
	public String getColor() {
		return this.color;
	}

	public char getRepresentation() {
		return this.representation;
	}

	public boolean isEqualColor(Color color) {
		if (this.color.equals(color.getColor())) {
			return true;
		}
		return false;
	}

	public boolean isEqualType(Type type) {
		if (this.representation == type.getRepresentation()) {
			return true;
		}

		return false;
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

	public double getPoints() {

		return this.points;
	}

	public boolean isBlank() {
		return this.representation == Type.BLANK.getRepresentation();
	}



}
