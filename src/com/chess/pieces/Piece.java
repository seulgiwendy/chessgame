package com.chess.pieces;

public class Piece {

	public static final String WHITE_STRING = "white";
	public static final String BLACK_STRING = "black";
	public static final String BLANK_STRING = "blank";
	public static final char WHITE_PAWN_REPRESENTATION = 'p';
	public static final char BLACK_PAWN_REPRESENTATION = 'P';
	public static final char WHITE_ROOK_REPRESENTATION = 'r';
	public static final char WHITE_KNIGHT_REPRESENTATION = 'n';
	public static final char WHITE_BISHOP_REPRESENTATION = 'b';
	public static final char WHITE_KING_REPRESENTATION = 'k';
	public static final char WHITE_QUEEN_REPRESENTATION = 'q';
	public static final char BLACK_ROOK_REPRESENTATION = 'R';
	public static final char BLACK_KNIGHT_REPRESENTATION = 'N';
	public static final char BLACK_BISHOP_REPRESENTATION = 'B';
	public static final char BLACK_KING_REPRESENTATION = 'K';
	public static final char BLACK_QUEEN_REPRESENTATION = 'Q';
	public static final char BLANK_REPRESENTATION = '*';

	private String type;
	private String color;
	private char representation;

	private Piece(String color) {
		this.color = color;
	}

	private Piece(String color, char representation) {
		this.color = color;
		this.representation = representation;
	}

	private Piece(String type, String color, char representation) {
		this.color = color;
		this.type = type;
		this.representation = representation;
	}

	public void setColor(String color) {
		this.color = color;

	}

	public String getColor() {
		return this.color;
	}

	public String getType() {
		return this.type;
	}

	public char getRepresentation() {
		return this.representation;
	}
	
	public static Piece createBlankPiece() {
		return new Piece("blank", BLANK_STRING, BLANK_REPRESENTATION);
	}

	public static Piece createWhitePawn() {

		return new Piece("pawn", WHITE_STRING, WHITE_PAWN_REPRESENTATION);
	}

	public static Piece createBlackPawn() {
		return new Piece("pawn", BLACK_STRING, BLACK_PAWN_REPRESENTATION);
	}

	public static Piece createWhiteRook() {
		return new Piece("rook", WHITE_STRING, WHITE_ROOK_REPRESENTATION);

	}

	public static Piece createWhiteKnight() {
		return new Piece("knight", WHITE_STRING, WHITE_KNIGHT_REPRESENTATION);
	}

	public static Piece createWhiteBishop() {
		return new Piece("bishop", WHITE_STRING, WHITE_BISHOP_REPRESENTATION);
	}

	public static Piece createWhiteQueen() {

		return new Piece("queen", WHITE_STRING, WHITE_QUEEN_REPRESENTATION);
	}

	public static Piece createWhiteKing() {
		return new Piece("king", WHITE_STRING, WHITE_KING_REPRESENTATION);
	}

	public static Piece createBlackRook() {
		return new Piece("rook", BLACK_STRING, BLACK_ROOK_REPRESENTATION);
	}

	public static Piece createBlackKnight() {
		return new Piece("knight", BLACK_STRING, BLACK_KNIGHT_REPRESENTATION);
	}

	public static Piece createBlackBishop() {
		return new Piece("bishop", BLACK_STRING, BLACK_BISHOP_REPRESENTATION);
	}

	public static Piece createBlackQueen() {
		return new Piece("queen", BLACK_STRING, BLACK_QUEEN_REPRESENTATION);
	}

	public static Piece createBlackKing() {
		return new Piece("king", BLACK_STRING, BLACK_KING_REPRESENTATION);
	}

	public boolean isBlack() {
		if (this.getColor().equals(BLACK_STRING)) {
			return true;
		}
		return false;
	}

	public boolean isWhite() {
		if (this.getColor().equals(WHITE_STRING)) {
			return true;
		}
		return false;
	}

}
