package com.tap.model;

public class CartItem {
	
	private int menuId;
	private int restaurantId;
	private double price;
	private String name;
	private int quantity;
	public CartItem(int menuId, int restaurantId, double price, String name, int quantity) {
		super();
		this.menuId = menuId;
		this.restaurantId = restaurantId;
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
	    return price * quantity;
	}

}
