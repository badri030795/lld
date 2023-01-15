package com.tictactoe.tictactoe.model;

import com.tictactoe.tictactoe.factories.BotPlayingStrategyFactory;
import com.tictactoe.tictactoe.strategies.BotPlayingStrategy;

public class Bot extends Player {

	private BotDifficultyLevel botDifficultyLevel;

	private BotPlayingStrategy playingStrategy;

	public Bot(String name, PlayerType type, char symbol, BotDifficultyLevel level) {
		super(name, type, symbol);
		this.botDifficultyLevel = level;
		this.playingStrategy = BotPlayingStrategyFactory.getStrategy(level);
	}

	@Override
	public Moves decideMove(Player player, Board board) {
		return playingStrategy.decideMove(player, board);
	}

	public BotDifficultyLevel getLevel() {
		return botDifficultyLevel;
	}

	public void setLevel(BotDifficultyLevel level) {
		this.botDifficultyLevel = level;
	}

	public BotPlayingStrategy getPlayingStrategy() {
		return playingStrategy;
	}

	public void setPlayingStrategy(BotPlayingStrategy playingStrategy) {
		this.playingStrategy = playingStrategy;
	}
}
