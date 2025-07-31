package com.zaw.CoinGame_Exception.service;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.zaw.CoinGame_Exception.entity.Coin;

@Component
public class CoinServiceImpl implements CoinService{
	
	Random random=new Random();
	Coin coin=new Coin();

	@Override
	public String turnOver() {
		int num=random.nextInt(2);
		return (num==0)?"Head": "Tail";
	}

	@Override
	public Coin setNameFromController(String name) {
		 coin.setName(name);
		 coin.setValue(turnOver());
		 return coin;
		
	}

}
