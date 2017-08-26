package com.wheejuni.chess.domain;

import java.util.ArrayList;

import com.wheejuni.chess.domain.piecesfactory.BlackRookCreator;
import com.wheejuni.chess.domain.piecesfactory.PieceTypeFactory;
import com.wheejuni.chess.pieces.Piece;
import com.wheejuni.chess.pieces.Piece.Color;
import com.wheejuni.chess.pieces.Piece.Type;

public class Rank {

	private ArrayList<Piece> row = new ArrayList<>();
	private PieceTypeFactory ptf;

	public void addPiece(Piece piece) {
		row.add(piece);
	}
	
	public void addPieceByIndex(Piece piece, int index) {
		row.set(index, piece);
	}

	public void whiteInitialize() {
		for (int i = 0; i < 8; i++) {
			row.add(new Piece(Piece.Color.WHITE, Piece.Type.PAWN_WHITE));
		}
	}

	public void blackInitialize() {
		for (int i = 0; i < 8; i++) {
			row.add(new Piece(Piece.Color.BLACK, Piece.Type.PAWN_BLACK));
		}
	}

	public void blankInitialize() {

		for (int i = 0; i < 8; i++) {
			row.add(new Piece(Piece.Color.BLANK, Piece.Type.BLANK));
		}

	}
	
	public void defaultBlackRankSetInitialize() {
		row.add(new Piece(Color.BLACK, Type.ROOK));
		row.add(new Piece(Color.BLACK, Type.KNIGHT));
		row.add(new Piece(Color.BLACK, Type.BISHOP));
		row.add(new Piece(Color.BLACK, Type.QUEEN));
		row.add(new Piece(Color.BLACK, Type.KING));
		row.add(new Piece(Color.BLACK, Type.BISHOP));
		row.add(new Piece(Color.BLACK, Type.KNIGHT));
		row.add(new Piece(Color.BLACK, Type.ROOK));
	}
	
	public void defaultWhiteRankSetInitialize() {
		
		row.add(new Piece(Color.WHITE, Type.ROOK));
		row.add(new Piece(Color.WHITE, Type.KNIGHT));
		row.add(new Piece(Color.WHITE, Type.BISHOP));
		row.add(new Piece(Color.WHITE, Type.QUEEN));
		row.add(new Piece(Color.WHITE, Type.KING));
		row.add(new Piece(Color.WHITE, Type.BISHOP));
		row.add(new Piece(Color.WHITE, Type.KNIGHT));
		row.add(new Piece(Color.WHITE, Type.ROOK));
		
	}

	public int getEqualPieces(Piece piece) {
		int count = 0;

		for (Piece pieceOnRank : this.row) {
			if (pieceOnRank.equals(piece)) {
				count++;
			}
		}

		return count;
	}
	
	public Piece getPieceByPosition(int position) {
		return this.row.get(position);
	}
	
	
	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();

		for (int i = 0; i < this.row.size(); i++) {
			sbf.append(this.row.get(i).getRepresentation());
		}

		return sbf.toString();
	}

	public double calculatePoint() {
		double point = 0;
		for (Piece piece : this.row) {
			point += piece.getPoints();
		}
		return point;
	}

}
