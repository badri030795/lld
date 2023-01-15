package com.tictactoe.tictactoe.strategies;

import com.tictactoe.tictactoe.model.Board;
import com.tictactoe.tictactoe.model.Moves;
import com.tictactoe.tictactoe.model.Player;

public interface BotPlayingStrategy {

	Moves decideMove(Player player, Board board);

}
