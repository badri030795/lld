package com.tictactoe.tictactoe.model;

public class Cell {

	private Player player;

	private int row;

	private int col;

	private CellState cellState;

	public Cell(int row, int column) {
		this.row = row;
		this.col = column;
		this.cellState = CellState.EMPTY;
	}

	public Cell() {

	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public CellState getCellState() {
		return cellState;
	}

	public void setCellState(CellState cellState) {
		this.cellState = cellState;
	}
}
