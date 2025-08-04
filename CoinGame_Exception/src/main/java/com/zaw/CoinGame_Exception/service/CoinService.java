package com.zaw.CoinGame_Exception.service;

import com.zaw.CoinGame_Exception.entity.Coin;
import com.zaw.CoinGame_Exception.entity.Player;

public interface CoinService {	
	public String turnOver();
	public Coin setNameFromController(String name);
	
}
