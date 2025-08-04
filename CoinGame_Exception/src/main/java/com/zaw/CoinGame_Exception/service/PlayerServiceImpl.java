package com.zaw.CoinGame_Exception.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zaw.CoinGame_Exception.entity.PlayCoin;
import com.zaw.CoinGame_Exception.entity.Player;
import com.zaw.CoinGame_Exception.exceptionhandling.CoinException;


@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	CoinService service;

	List<Player> players = new ArrayList<>();

	@Override
	public Player save(String name, int bet) {
		Player player = new Player();
		player.setName(name);
		player.setBet(bet);
		player.setId(players.size() + 1);
		players.add(player);
		return player;
	}

	@Override
	public String play(PlayCoin playcoin) {
		// TODO Auto-generated method stub

		Player player = players.stream().filter(pp -> pp.getId() == playcoin.getId()).findFirst().orElse(null);
		
		if(player ==null) {
			throw new CoinException("Id not found");
		}	

		if (playcoin.getCoin().equals("Tail") | playcoin.getCoin().equals("Head")) {
			if (playcoin.getCoin().equals(service.turnOver())) {
				player.setBet(player.getBet() + playcoin.getBet());
				return "Congratulations..." + System.lineSeparator() + "Name: " + player.getName()
						+ System.lineSeparator() + "Cash : " + player.getBet();
			} else {
				player.setBet(player.getBet() - playcoin.getBet());
				return "Sorry..." + System.lineSeparator() + "Name: " + player.getName() + System.lineSeparator()
						+ "Cash : " + player.getBet();
			}
		} else {
			throw new CoinException("have to type Head or Tail");
		}

	}

}
