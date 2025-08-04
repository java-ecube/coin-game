package com.zaw.CoinGame_Exception.service;

import com.zaw.CoinGame_Exception.entity.PlayCoin;
import com.zaw.CoinGame_Exception.entity.Player;

public interface PlayerService {
	
	public Player save(String name, int bet);
	public String play(PlayCoin  playcoin);

}
