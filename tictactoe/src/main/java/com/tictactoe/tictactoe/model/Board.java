package com.tictactoe.tictactoe.model;

import java.util.*;

public class Board {

	private List<List<Cell>> board = new ArrayList<>();

	public Board(int dimension) {
		for (int i = 0; i < dimension; i++) {
			List<Cell> list = new ArrayList<>();
			for (int j = 0; j < dimension; j++) {
				list.add(new Cell(i, j));
			}
			board.add(list);
		}
	}

	public Board() {

	}

	public List<List<Cell>> getBoard() {
		return board;
	}

	public void setBoard(List<List<Cell>> board) {
		this.board = board;
	}

	public void display() {
		for (int i = 0; i < board.size(); i++) {
			for (int j = 0; j < board.size(); j++) {
				if (board.get(i).get(j).getCellState().equals(CellState.EMPTY)) {
					System.out.print("|   |");
				} else {
					System.out.print("| " + board.get(i).get(j).getPlayer().getSymbol() + " |");
				}
			}
			System.out.println("");
		}
	}
}
