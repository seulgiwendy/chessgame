package com.chess.domain;

import com.chess.exceptions.InvalidPositionInputException;

public class Position {

	private int rankIndex;
	private int columnIndex;

	@Deprecated
	public Position() {

	}

	public Position(String position) {
		String[] positionByString = position.split("");
		switch (positionByString[0].toLowerCase()) {
		case "a":
			this.columnIndex = 0;
			break;
		case "b":
			this.columnIndex = 1;
			break;
		case "c":
			this.columnIndex = 2;
			break;
		case "d":
			this.columnIndex = 3;
			break;
		case "e":
			this.columnIndex = 4;
			break;
		case "f":
			this.columnIndex = 5;
			break;
		case "g":
			this.columnIndex = 6;
			break;
		case "h":
			this.columnIndex = 7;
			break;
		default:
			throw new InvalidPositionInputException("Invalid Position Request");
		}

		this.rankIndex = Integer.parseInt(positionByString[1]) - 1;

	}

	public int getRankIndex() {
		return rankIndex;
	}

	public void setRankIndex(int rankIndex) {
		this.rankIndex = rankIndex;
	}

	public int getColumnIndex() {
		return columnIndex;
	}

	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}

}
