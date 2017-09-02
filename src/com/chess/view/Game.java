package com.chess.view;

import java.util.Scanner;

import com.chess.domain.Board;

public class Game {

	public static void main(String args[]) {
		Board board = new Board();
		board.initialize();

		boolean progSwitch = true;

		System.out.println("시작: start, 종료: end");
		while (progSwitch) {
			Scanner scn = new Scanner(System.in);
			if (scn.next().equals("start")) {
				System.out.println(board.getBoardStatus());
				
			}
			if (scn.next().equals("end")) {
				progSwitch = false;
				scn.close();
			}
		}
	}

}
