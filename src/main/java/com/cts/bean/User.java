package com.cts.bean;

public class User {
	private String uId;
	private String name;
	private Cart cart;
	
	public User() {
		super();
	}
	public User(String uId, String name, Cart cart) {
		super();
		this.uId = uId;
		this.name = name;
		this.cart = cart;
	}
	
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	

}
