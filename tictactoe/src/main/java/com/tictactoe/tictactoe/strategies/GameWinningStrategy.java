package com.tictactoe.tictactoe.strategies;

import com.tictactoe.tictactoe.model.Board;
import com.tictactoe.tictactoe.model.Cell;
import com.tictactoe.tictactoe.model.Player;

public interface GameWinningStrategy {

	boolean checkWinner(Board board, Player lastMovePlayer, Cell moveCell);

}
