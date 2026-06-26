package com.tap.servlet;

import java.io.IOException;
import java.sql.Timestamp;

import com.tap.dao.OrderTableDAO;
import com.tap.daoimpl.OrderItemDAOImpl;
import com.tap.daoimpl.OrderTableDAOImpl;
import com.tap.model.Cart;
import com.tap.model.CartItem;
import com.tap.model.OrderItem;
import com.tap.model.OrderTable;
import com.tap.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession session = req.getSession();

		Cart cart = (Cart) session.getAttribute("cart");
		
		if(cart == null || cart.getItems().isEmpty()) {
		    res.sendRedirect("cart.jsp");
		    return;
		}

		Integer restaurantId = (Integer) session.getAttribute("restaurantId");

		User user = (User) session.getAttribute("loggedInUser");
		
		if (user == null) {
		    res.sendRedirect("login.jsp");
		    return;
		}


		//int userId = user.getUserId();
		String paymentMethod = req.getParameter("paymentMode");
		System.out.println("Grand Total = " + cart.getGrandTotal());
        OrderTable order = new OrderTable();
        order.setUserId(user.getUserId());

       // order.setUserId(userId);
        order.setRestaurantId(restaurantId);
        order.setOrderDate(new Timestamp(System.currentTimeMillis()));
        order.setTotalAmount(cart.getGrandTotal());
        order.setStatus("Placed");
        order.setPaymentMethod(paymentMethod);

        OrderTableDAO orderDAO = new OrderTableDAOImpl();

        // Returns generated orderId
        int orderId = orderDAO.addOrder(order);
        if(orderId>0) {
        	OrderItemDAOImpl orderItemDAO = new OrderItemDAOImpl();

            for (CartItem cartItem : cart.getItems().values()) {

                OrderItem item = new OrderItem();
                
                

                item.setOrderId(orderId);
                item.setMenuId(cartItem.getMenuId());
                item.setQuantity(cartItem.getQuantity());
                item.setItemTotal(cartItem.getTotalPrice());
                
                System.out.println("Logged in user = " + session.getAttribute("loggedInUser"));
                System.out.println("User ID = " + order.getUserId());

                orderItemDAO.addOrderItem(item);
            }

            session.removeAttribute("cart");
            session.removeAttribute("restaurantId");
            
            session.setAttribute("orderId", orderId);

            session.setAttribute("totalAmount", order.getTotalAmount());

            res.sendRedirect("orderSuccess.jsp");
        }
    	}
        }

        


