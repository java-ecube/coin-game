package com.zaw.CoinGame_Exception.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class PlayCoin {
	
	@Min(value=0, message = "have to enter player id")
	private int id;
	
	@Min(value=100, message = "bet is min 100")
	private int bet;
	
	private String coin;
	
	public PlayCoin() {}

	public PlayCoin(int id, int bet, String coin) {
		super();
		this.id = id;
		this.bet = bet;
		this.coin = coin;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBet() {
		return bet;
	}

	public void setBet(int bet) {
		this.bet = bet;
	}

	public String getCoin() {
		return coin;
	}

	public void setCoin(String coin) {
		this.coin = coin;
	}
	
	
	
	

}
