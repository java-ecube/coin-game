package com.zaw.CoinGame_Exception.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public class Player {
	
	private int id;
	
	@NotEmpty(message = "have to fill name")
	private String name;
	
	private int score;
	
	@Min(value = 100, message = "at least 100 kyats")
	@Max(value = 50000, message = "at most 50000 kyats")	
	private int bet;
	
	public Player() {}

	public Player(int id, String name, int score, int bet) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.bet = bet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getBet() {
		return bet;
	}
	
	public void setBet(int bet) {
		this.bet = bet;
	}
	
	

}
