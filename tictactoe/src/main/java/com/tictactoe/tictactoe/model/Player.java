package com.tictactoe.tictactoe.model;

import java.util.Scanner;

public class Player {

	private PlayerType type;

	private char symbol;

	private String name;

	public Player() {

	}

	public Player(String name, PlayerType type, char symbol) {
		this.name = name;
		this.type = type;
		this.symbol = symbol;
	}

	public PlayerType getType() {
		return type;
	}

	public void setType(PlayerType type) {
		this.type = type;
	}

	public Moves decideMove(Player player, Board board) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row index where you wanted to move? Starting from 1");
		int row = sc.nextInt();
		System.out.println("Enter the column index where you wanted to move ? Starting from 1");
		int col = sc.nextInt();
		return new Moves(player, new Cell(row, col));
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
