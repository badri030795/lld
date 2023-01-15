package com.tictactoe.tictactoe.model;

import java.util.*;

import com.tictactoe.tictactoe.exception.InvalidGameConstructionParameterException;
import com.tictactoe.tictactoe.strategies.GameWinningStrategy;
import com.tictactoe.tictactoe.strategies.OrderOneWinningStrategy;

public class Game {

	private Board board = null;

	/** for performing the undo operation */
	private List<Board> boardList;

	private List<Player> players;

	private GameState gameState;

	private List<Moves> moves;

	private int nextPlayerIndex = 0;

	private int count = 0;

	private Player winner;

	private GameWinningStrategy winningStrategy;

	public Game() {

	}

	public GameWinningStrategy getWinningStrategy() {
		return winningStrategy;
	}

	public void setWinningStrategy(GameWinningStrategy winningStrategy) {
		this.winningStrategy = winningStrategy;
	}

	public void displayBoard() {
		this.board.display();
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void executeNextMove() {
		Player player = players.get(nextPlayerIndex);
		count++;

		Moves move = player.decideMove(player, board);

		int row = move.getCell().getRow();
		int col = move.getCell().getCol();

		int size = board.getBoard().size();

		board.getBoard().get(row).get(col).setCellState(CellState.OCCUPIED);
		board.getBoard().get(row).get(col).setPlayer(player);

		System.out.println("Move happened at :" + row + " " + col);
		Moves finalMove = new Moves(player, board.getBoard().get(row).get(col));
		moves.add(finalMove);

		if (winningStrategy.checkWinner(board, players.get(nextPlayerIndex), finalMove.getCell())) {
			gameState = gameState.ENDED;
			winner = players.get(nextPlayerIndex);
		} else if (count >= (size * size)) {
			gameState = gameState.DRAWN;
			winner = null;
		}
		nextPlayerIndex++;
		/** finding the turn of the next player */
		nextPlayerIndex %= players.size();
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public int getNextPlayerIndex() {
		return nextPlayerIndex;
	}

	public void setNextPlayerIndex(int nextPlayerIndex) {
		this.nextPlayerIndex = nextPlayerIndex;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public List<Board> getBoardList() {
		return boardList;
	}

	public void setBoardList(List<Board> boardList) {
		this.boardList = boardList;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> player) {
		this.players = player;
	}

	public GameState getGameState() {
		return gameState;
	}

	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}

	public List<Moves> getMoves() {
		return moves;
	}

	public void setMoves(List<Moves> moves) {
		this.moves = moves;
	}

	public static class Builder {

		private int dimensions;

		private List<Player> player;

		public Builder setDimensions(int dimensions) {
			this.dimensions = dimensions;
			return this;
		}

		public Builder setPlayer(List<Player> player) {
			this.player = player;
			return this;
		}

		private boolean valid() throws InvalidGameConstructionParameterException {
			if (this.dimensions < 3) {
				throw new InvalidGameConstructionParameterException("Dimensions cannot be less than 3");
			}

			if (this.player.size() != this.dimensions - 1) {
				throw new InvalidGameConstructionParameterException("Total players must be Dimensions-1");
			}
			return true;
		}

		public Game Build() throws InvalidGameConstructionParameterException {
			if (!valid()) {
				throw new InvalidGameConstructionParameterException("Issue with the Parameter");
			}
			Game game = new Game();
			game.setBoard(new Board(dimensions));
			game.setPlayers(player);
			game.setNextPlayerIndex(0);
			game.setMoves(new ArrayList<>());
			game.setGameState(GameState.INPROGRESS);
			game.setWinningStrategy(new OrderOneWinningStrategy(dimensions));
			return game;
		}

	}
}
