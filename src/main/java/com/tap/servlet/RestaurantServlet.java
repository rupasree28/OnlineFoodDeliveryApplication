package com.tap.servlet;

import java.io.IOException;
import java.util.List;

import com.tap.dao.RestaurantDAO;
import com.tap.daoimpl.RestaurantDAOImpl;
import com.tap.model.Restaurant;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RestaurantServlet")
public class RestaurantServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        RestaurantDAO dao = new RestaurantDAOImpl();

        List<Restaurant> restaurantList = dao.getAllRestaurant();
        
//        for(Restaurant i:restaurantList) {
//        	System.out.println(i);
//        }

        request.setAttribute("restaurantList", restaurantList);

        request.getRequestDispatcher("restaurants.jsp")
               .forward(request, response);

    }

}