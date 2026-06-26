package com.tap.servlet;

import java.io.IOException;
import java.util.List;

import com.tap.daoimpl.MenuDAOImpl;
import com.tap.model.Cart;
import com.tap.model.CartItem;
import com.tap.model.Menu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String action=req.getParameter("action");
		
		
		HttpSession session=req.getSession();
		
		
		Cart cart=(Cart)(session.getAttribute("cart"));
		
		if(action.equals("add")) {
			Integer restaurantId=(Integer)(session.getAttribute("restaurantId"));
			
			Integer newrestaurant_id=Integer.parseInt(req.getParameter("restaurantId"));
			
			
			
			if(cart==null || restaurantId!=newrestaurant_id || !restaurantId.equals(newrestaurant_id)) {
				cart=new Cart();
				
				session.setAttribute("cart", cart);
				session.setAttribute("restaurantId", newrestaurant_id);
				System.out.println("Cart HashCode: " + System.identityHashCode(cart));
			} 
			
			addItemToCart(req,cart);
		}else if(action.equals("update")) {
			updateItemToCart(req,cart);
			
		}else if(action.equals("delete")) {
			deleteItemFromCart(req,cart);
		}
		res.sendRedirect("cart.jsp");
	}

	private void deleteItemFromCart(HttpServletRequest req, Cart cart) {
		// TODO Auto-generated method stub
		 int menu_id=Integer.parseInt(req.getParameter("menuId"));
		
		 cart.delete(menu_id);
		
		
	}

	private void updateItemToCart(HttpServletRequest req, Cart cart) {
		// TODO Auto-generated method stub
		 int menu_id=Integer.parseInt(req.getParameter("menuId"));
		 int quantity=Integer.parseInt(req.getParameter("quantity"));
		
		 cart.updateItem(menu_id, quantity);
		 
		 
	}
 
	private void addItemToCart(HttpServletRequest req, Cart cart) {
		// TODO Auto-generated method stub
		int quantity=Integer.parseInt(req.getParameter("quantity"));
		int menu_id=Integer.parseInt(req.getParameter("menuId"));
		MenuDAOImpl m=new MenuDAOImpl();
		Menu menu=m.getMenu(menu_id);
	
		CartItem cartitem=new CartItem(menu.getMenuId(),menu.getRestaurantId(),menu.getPrice(),menu.getItemName(),quantity);
		cart.addItem(cartitem);
		
		
		
	}
}