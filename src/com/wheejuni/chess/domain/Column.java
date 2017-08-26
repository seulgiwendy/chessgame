package com.wheejuni.chess.domain;

import java.util.ArrayList;

import com.wheejuni.chess.pieces.Piece;

public class Column {

	// ArrayList<Integer> column;
	ArrayList<Piece> column;

	public Column(ArrayList<Piece> column) {

		this.column = column;
	}

	public Column(Board board, int indexOfColumn) {
		column = new ArrayList<>();
		for (Rank rank : board.getRows()) {
			Piece piece = rank.getPieceByPosition(indexOfColumn);
			this.column.add(piece);
		}

	}

	public int getPiecesCount() {
		return this.column.size();
	}

	public int getNonBlankPiecesCount() {
		int count = this.column.size();
		for (Piece piece : this.column) {
			if (piece.isBlank()) {
				count--;
			}
		}
		return count;
	}

	public int getBlackPawnsCount() {
		int count = 0;
		for (Piece piece: this.column) {
			if (piece.isBlackPawn()) {
				count++;
			}
		}
		return count;
	}

	public int getWhitePanwsCount() {
		int count = 0;
		for (Piece piece: this.column) {
			if (piece.isWhitePawn()) {
				count++;
			}
		}
		
		return count;
	}

	public int getIdenticalWhitePawnsCount() {
		int count = this.getWhitePanwsCount();
		if (count == 1) {
			return 0;
		}
		return count;
	}

	
	
	

}
