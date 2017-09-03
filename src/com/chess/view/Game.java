package com.chess.view;

import java.util.Scanner;

import com.chess.domain.Board;
import com.chess.domain.Position;

public class Game {

	public static void main(String args[]) {
		Board board = new Board();
		board.initialize();

		boolean progSwitch = true;

		System.out.println("시작: start, 종료: end");
		while (progSwitch) {
			Scanner scn = new Scanner(System.in);
			String userInput = scn.nextLine();
			if (userInput.equals("start")) {
				System.out.println(board.showBoard());
				System.out.println("이동 명령: move (원위치, 새위치)");
			}

			if (userInput.startsWith("move")) {
				String[] commands = userInput.split(" ");
				Position originalPosition = new Position(commands[1]);
				Position destPosition = new Position(commands[2]);

				board.move(originalPosition, destPosition);
				System.out.println(board.showBoard());
			}

			if (userInput.equals("end")) {
				progSwitch = false;
				scn.close();
			}
		}
	}

}
