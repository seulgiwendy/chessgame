package com.wheejuni.chess.domain;

import java.util.ArrayList;

import com.wheejuni.chess.pieces.Pawn;

public class Board {
	public static final String BLANK_SPACE = "*";

	private String currentBoard;
	private ArrayList<Pawn> whitePawns;
	private ArrayList<Pawn> blackPawns;
	private ArrayList<BoardTile> board;
	private ArrayList<Rank> row = new ArrayList<>();

	public void add(Pawn pawn) {

		if (whitePawns == null) {
			whitePawns = new ArrayList<>();
		}

		if (blackPawns == null) {
			blackPawns = new ArrayList<>();
		}

		if (pawn.getColor().equals("white")) {
			whitePawns.add(pawn);
		}
		if (pawn.getColor().equals("black")) {
			blackPawns.add(pawn);
		}

	}

	public int size() {
		return this.whitePawns.size() + this.blackPawns.size();
	}

	public Pawn findWhitePawn(int position) {
		return this.whitePawns.get(position);
	}

	public Pawn findBlackPawn(int position) {
		return this.blackPawns.get(position);
	}

	public void initialize() {
			Rank rank = new Rank();
			rank.blankInitialize();
			this.row.add(rank);
			Rank white = new Rank();
			white.blackInitialize();
			this.row.add(white);
		
		for (int i = 2; i < 6; i++) {
			
			this.row.add(rank);
			
		}
			Rank black = new Rank();
			black.whiteInitialize();
			this.row.add(black);
			this.row.add(rank);
			for (int i = 0; i < this.row.size(); i++) {
				System.out.println(this.row.get(i));
				
			}
		
	}

	public String getWhitePawnsResult() {
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < whitePawns.size(); i++) {
			sbf.append(whitePawns.get(i).getRepresentation());
		}
		return sbf.toString();

	}

	public String getBlackPawnsResult() {

		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < blackPawns.size(); i++) {
			sbf.append(blackPawns.get(i).getRepresentation());
		}
		return sbf.toString();

	}
	
	public String getCurrentBoardStatus() {
		return this.currentBoard;
	}

}
