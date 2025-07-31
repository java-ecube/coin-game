package com.zaw.CoinGame_Exception.entity;

public class Coin {
	private String name;
	private String value ;
	public Coin() {}
	public Coin(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Coin [name=" + name + ", value=" + value + "]";
	}
}
