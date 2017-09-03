package com.chess.domain;

import java.util.ArrayList;
import java.util.Collections;

import com.chess.exceptions.UninitializedRankException;
import com.chess.pieces.Piece;

public class Rank {

	private static final int RANK_MAX_SIZE = 8;

	ArrayList<Piece> pieces = new ArrayList<>();

	public void blankInitialize() {
		for (int i = 0; i < RANK_MAX_SIZE; i++) {
			pieces.add(Piece.createBlankPiece());
		}
	}

	public void blackPawnInitialize() {

		for (int i = 0; i < RANK_MAX_SIZE; i++) {
			pieces.add(Piece.createBlackPawn());
		}
	}

	public void whitePawnInitialize() {

		for (int i = 0; i < RANK_MAX_SIZE; i++) {
			pieces.add(Piece.createWhitePawn());
		}
	}

	public void whiteDefaultInitialize() {
		pieces.add(Piece.createWhiteRook());
		pieces.add(Piece.createWhiteKnight());
		pieces.add(Piece.createWhiteBishop());
		pieces.add(Piece.createWhiteQueen());
		pieces.add(Piece.createWhiteKing());
		pieces.add(Piece.createWhiteBishop());
		pieces.add(Piece.createWhiteKnight());
		pieces.add(Piece.createWhiteRook());
	}

	public void blackDefaultInitialize() {
		pieces.add(Piece.createBlackRook());
		pieces.add(Piece.createBlackKnight());
		pieces.add(Piece.createBlackBishop());
		pieces.add(Piece.createBlackQueen());
		pieces.add(Piece.createBlackKing());
		pieces.add(Piece.createBlackBishop());
		pieces.add(Piece.createBlackKnight());
		pieces.add(Piece.createBlackRook());

	}

	public Piece getPiece(int index) {
		return pieces.get(index);
	}

	public ArrayList<Piece> getBlackPieces() {

		ArrayList<Piece> returnpieces = new ArrayList<>();

		for (Piece p : pieces) {
			if (p.isBlack()) {
				returnpieces.add(p);
			}
		}
		Collections.sort(returnpieces);
		return returnpieces;
	}

	public ArrayList<Piece> getWhitePieces() {

		ArrayList<Piece> returnpieces = new ArrayList<>();

		for (Piece p : pieces) {
			if (p.isWhite()) {
				returnpieces.add(p);
			}
		}
		Collections.sort(returnpieces);
		return returnpieces;
	}

	public int getPiecesCount() {
		if (pieces == null) {
			return 0;
		}
		return pieces.size();
	}

	public int getEqualPiecesCount(Piece piece) {
		int count = 0;
		for (Piece p : pieces) {
			if (p.equals(piece)) {
				count++;
			}
		}
		return count;
	}

	public void addPieceByIndex(int index, Piece piece) {
		try {
			pieces.set(index, piece);
		} catch (Exception e) {
			throw new UninitializedRankException("you have to initialize the rank, prior to put the pieces in it.");
		}
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();

		for (Piece p : pieces) {
			sbf.append(p.getRepresentation());
		}

		return sbf.toString();
	}

	public double getBlackPoint() {
		double points = 0.0;

		for (Piece p : pieces) {
			if (p.isBlack()) {
				points += p.getPoints();
			}
		}

		return points;
	}

	public double getWhitePoint() {
		double points = 0.0;

		for (Piece p : pieces) {
			if (p.isWhite()) {
				points += p.getPoints();
			}
		}

		return points;
	}

}
