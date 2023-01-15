package com.tictactoe.tictactoe;

import java.util.Scanner;
import java.util.*;
import com.tictactoe.tictactoe.controllers.GameController;
import com.tictactoe.tictactoe.model.Bot;
import com.tictactoe.tictactoe.model.BotDifficultyLevel;
import com.tictactoe.tictactoe.model.Game;
import com.tictactoe.tictactoe.model.GameState;
import com.tictactoe.tictactoe.model.Player;
import com.tictactoe.tictactoe.model.PlayerType;

public class TicTacToeMain {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);

		GameController controller = new GameController();

		System.out.println("What is the Dimension of the game?");
		int dimension = sc.nextInt();

		System.out.println("Do you have any bot? Y/N");
		String isBotAvailable = sc.next();
		int totalPlayers = dimension - 1;

		List<Player> playerList = new ArrayList<>();
		if (isBotAvailable.equalsIgnoreCase("Y")) {
			totalPlayers = totalPlayers - 1;
			System.out.println("Enter the Name of the Bot");
			String name = sc.next();
			System.out.println("Enter the symbol for the Bot " + name);
			String symbol = sc.next();
			playerList.add(new Bot(name, PlayerType.BOT, symbol.charAt(0), BotDifficultyLevel.EASY));
		}

		for (int i = 0; i < totalPlayers; i++) {
			System.out.println("Enter the Name of the player");
			String name = sc.next();
			System.out.println("Enter the symbol for the Player " + name);
			String symbol = sc.next();
			playerList.add(new Player(name, PlayerType.HUMAN, symbol.charAt(0)));
		}

		Game game = controller.createGame(dimension, playerList);

		while (controller.getGameStatus(game).equals(GameState.INPROGRESS)) {
			System.out.println("This is the Current Board");

			controller.displayBoard(game);

			System.out.println("Do you want to undo the move? Y/N");
			String input = sc.next();
			if (input.equalsIgnoreCase("Y")) {
				controller.undo(game);
			} else {
				controller.executeNextMove(game);
			}
		}

		controller.displayBoard(game);
		System.out.print("Game has ended and the Result is :");
		if (!game.getGameState().equals(GameState.DRAWN)) {
			System.out.print("Winner : " + game.getWinner().getName());
		} else {
			System.out.println(GameState.DRAWN);
		}
	}
}
