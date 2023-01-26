package com.parkinglot.parkinglot.model;

public class EntryGate extends Gate {

	private DisplayBoard displayBoard;

	public DisplayBoard getDisplayBoard() {
		return displayBoard;
	}

	public void setDisplayBoard(DisplayBoard displayBoard) {
		this.displayBoard = displayBoard;
	}

	public EntryGate(DisplayBoard displayBoard) {
		super();
		this.displayBoard = displayBoard;
	}

}
