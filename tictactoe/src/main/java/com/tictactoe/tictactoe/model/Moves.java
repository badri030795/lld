package com.tictactoe.tictactoe.model;

public class Moves {

	private Player player;

	private Cell cell;

	public Moves() {

	}

	public Moves(Player player, Cell cell) {
		this.player = player;
		this.cell = cell;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Cell getCell() {
		return cell;
	}

	public void setCell(Cell cell) {
		this.cell = cell;
	}
}
