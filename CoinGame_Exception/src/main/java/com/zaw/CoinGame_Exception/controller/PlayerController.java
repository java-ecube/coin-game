package com.zaw.CoinGame_Exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zaw.CoinGame_Exception.entity.PlayCoin;
import com.zaw.CoinGame_Exception.entity.Player;
import com.zaw.CoinGame_Exception.service.CoinService;
import com.zaw.CoinGame_Exception.service.PlayerService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/player")
public class PlayerController {
	
	@Autowired
	PlayerService plyaerService;
	

	@PostMapping("/save")
	public ResponseEntity<Player> save(@Valid @RequestBody Player player) {
		 return new ResponseEntity<Player>( plyaerService.save(player.getName(), player.getBet()), HttpStatus.CREATED);		
	}
	
	@GetMapping("/play")
	public ResponseEntity<String> play(@Valid @RequestBody PlayCoin playCoin) {		
		return new ResponseEntity<String>(plyaerService.play(playCoin), HttpStatus.OK);		
	}
}
