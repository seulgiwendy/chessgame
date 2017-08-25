package com.wheejuni.chess.domain;

public class Position {

	private int rankIndex;
	private int columnIndex;
	String symbol;

	public Position(String symbol) {
		this.symbol = symbol.toUpperCase();
		String[] input = symbol.toUpperCase().split("");
		switch (input[0]) {
		case "A":
			this.rankIndex = 0;
			break;
		case "B":
			this.rankIndex = 1;
			break;
		case "C":
			this.rankIndex = 2;
			break;
		case "D":
			this.rankIndex = 3;
			break;
		case "E":
			this.rankIndex = 4;
			break;
		case "F":
			this.rankIndex = 5;
			break;
		case "G":
			this.rankIndex = 6;
			break;
		case "H":
			this.rankIndex = 7;
			break;

		}

		this.columnIndex = Integer.parseInt(input[1]) - 1;
		this.symbol = symbol;

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

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
