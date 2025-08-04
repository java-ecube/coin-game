package com.zaw.CoinGame_Exception.exceptionhandling;

public class CoinCheckException extends RuntimeException{
	
	public CoinCheckException() {
		super("Have to enter Head or Tail");
	}

}
