package com.zaw.CoinGame_Exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zaw.CoinGame_Exception.entity.Coin;
import com.zaw.CoinGame_Exception.service.CoinService;

@RestController
@RequestMapping("/coin")
public class CoinController {
	
	@Autowired
	CoinService service;
	
	@GetMapping("/play")
	public ResponseEntity<String> trun(){
		return new ResponseEntity<String>(service.turnOver(), HttpStatus.OK);
	}
	
	@PostMapping("/name")
	public ResponseEntity<Coin> saveInfo(@RequestParam String name){
		Coin obj=service.setNameFromController(name);
		return new ResponseEntity<Coin> (obj, HttpStatus.CREATED);		
	}
	
}
