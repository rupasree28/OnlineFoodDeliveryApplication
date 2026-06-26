package com.tap.servlet;

import java.io.IOException;
import java.util.List;

import com.tap.daoimpl.MenuDAOImpl;
import com.tap.model.Menu;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class MenuServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		MenuDAOImpl m=new MenuDAOImpl();
//		int rest_id=Integer.parseInt(req.getParameter("restaurantId"));
//		List<Menu> l=m.getAllMenuByRestaurantId(rest_id);
//		for(Menu i:l) {
//			System.out.println(i);
//		}
//		req.setAttribute("l", l);
//		RequestDispatcher r=req.getRequestDispatcher("menu.jsp");
//		r.forward(req, resp);
		
		MenuDAOImpl m = new MenuDAOImpl();

		int rest_id = Integer.parseInt(req.getParameter("restaurantId"));

		System.out.println("Restaurant Id = " + rest_id);

		List<Menu> l = m.getAllMenuByRestaurantId(rest_id);

		System.out.println("Menu List = " + l);

		if(l != null){
		    System.out.println("Size = " + l.size());
		}

		req.setAttribute("l", l);

		req.getRequestDispatcher("menu.jsp").forward(req, resp);
	}

}
