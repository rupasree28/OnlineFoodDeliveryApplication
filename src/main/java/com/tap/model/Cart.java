package com.tap.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	Map<Integer,CartItem> items;
	
	public Cart(){
		
		items=new HashMap<Integer,CartItem>();
		
		
		
	}
	public void addItem(CartItem c) {
		int menu_id=c.getMenuId();
		
		
		if(items.containsKey(menu_id)) {
			CartItem existingitem=items.get(menu_id);
			existingitem.setQuantity(existingitem.getQuantity()+c.getQuantity());
			
		}else {
			items.put(menu_id,c);
		}
		
	}
//	public void addItem(CartItem c) {
//
//	    System.out.println("Cart HashCode: " + System.identityHashCode(this));
//
//	    int menu_id = c.getMenuId();
//
//	    System.out.println("Adding Menu Id : " + menu_id);
//
//	    System.out.println("Contains : " + items.containsKey(menu_id));
//
//	    System.out.println("Current Keys : " + items.keySet());
//
//	    if(items.containsKey(menu_id)) {
//
//	        CartItem existingitem = items.get(menu_id);
//
//	        existingitem.setQuantity(existingitem.getQuantity()+1);
//
//	    } else {
//
//	        items.put(menu_id, c);
//	    }
//
//	    System.out.println(items);
//	}
	
	public double getGrandTotal() {

	    double total = 0;

	    for(CartItem item : items.values()) {

	        total += item.getTotalPrice();

	    }

	    return total;
	}
	
	public void updateItem(int menuid,int quantity) {
		CartItem c=items.get(menuid);
		
		if(items.containsKey(menuid)) {
			if(quantity<=0) {
				items.remove(menuid);
			}else {
				c.setQuantity(quantity);
			}
		}
	}
	public void delete(int menuid) {
		if(items.containsKey(menuid)) {
			items.remove(menuid);
		}
	}
	public  Map<Integer, CartItem> getItems() {
		return items;
	}
	public  void setItems(Map<Integer, CartItem> items) {
		this.items = items;
	}


}
