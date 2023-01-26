package com.parkinglot.parkinglot.model;

public class ExitGate extends Gate {

	private DisplayBoard displayBoard;

	public DisplayBoard getDisplayBoard() {
		return displayBoard;
	}

	public void setDisplayBoard(DisplayBoard displayBoard) {
		this.displayBoard = displayBoard;
	}

	public ExitGate(DisplayBoard displayBoard) {
		super();
		this.displayBoard = displayBoard;
	}

}
