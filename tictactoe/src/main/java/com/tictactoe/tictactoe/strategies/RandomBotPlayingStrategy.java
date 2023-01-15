package com.tictactoe.tictactoe.strategies;

import com.tictactoe.tictactoe.model.Board;
import com.tictactoe.tictactoe.model.Cell;
import com.tictactoe.tictactoe.model.CellState;
import com.tictactoe.tictactoe.model.Moves;
import com.tictactoe.tictactoe.model.Player;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {

	@Override
	/** This Strategy will just add to the cell that is empty */
	public Moves decideMove(Player player, Board board) {
		for (int i = 0; i < board.getBoard().size(); i++) {
			for (int j = 0; j < board.getBoard().size(); j++) {
				if (board.getBoard().get(i).get(j).getCellState().equals(CellState.EMPTY)) {
					return new Moves(player, new Cell(i, j));
				}
			}
		}
		return null;
	}

}
