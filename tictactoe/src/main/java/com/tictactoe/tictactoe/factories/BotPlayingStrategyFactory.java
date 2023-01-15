package com.tictactoe.tictactoe.factories;

import com.tictactoe.tictactoe.model.BotDifficultyLevel;
import com.tictactoe.tictactoe.strategies.BotPlayingStrategy;
import com.tictactoe.tictactoe.strategies.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

	public static BotPlayingStrategy getStrategy(BotDifficultyLevel level) {
		return new RandomBotPlayingStrategy();
	}
}
