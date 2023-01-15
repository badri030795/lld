package com.tictactoe.tictactoe.controllers;

import com.tictactoe.tictactoe.model.Game;
import com.tictactoe.tictactoe.model.GameState;
import com.tictactoe.tictactoe.model.Player;

import java.util.*;

public class GameController {

	public void undo(Game game) {
	}

	public Game createGame(int dimensions, List<Player> player) {
		try {
			return Game.getBuilder().setDimensions(dimensions).setPlayer(player).Build();
		} catch (Exception e) {
			return null;
		}
	}

	public void executeNextMove(Game game) {
		game.executeNextMove();
	}

	public void displayBoard(Game game) {
		game.displayBoard();
	}

	public GameState getGameStatus(Game game) {
		return game.getGameState();
	}
}
