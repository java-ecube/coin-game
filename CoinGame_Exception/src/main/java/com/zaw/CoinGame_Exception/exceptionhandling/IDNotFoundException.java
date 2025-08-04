package com.zaw.CoinGame_Exception.exceptionhandling;

public class IDNotFoundException extends RuntimeException{
	public IDNotFoundException(){
		super("ID not found");
	}
	

}
