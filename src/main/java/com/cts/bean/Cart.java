package com.cts.bean;

import java.util.Set;

public class Cart {
	private String cId;
	
	private Set<MenuItem> menuItemList;
	
	private double total;

	public Set<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	public Cart(String cId, Set<MenuItem> menuItemList, double total) {
		super();
		this.cId = cId;
		this.menuItemList = menuItemList;
		this.total = total;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setMenuItemList(Set<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	public double getTotal() {
		return total;
	}



	public Cart() {

	}

}
