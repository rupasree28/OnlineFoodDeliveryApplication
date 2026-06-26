package com.tap.servlet;

import java.io.IOException;
import java.util.List;

import com.tap.dao.OrderTableDAO;
import com.tap.daoimpl.OrderTableDAOImpl;
import com.tap.model.OrderTable;
import com.tap.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/OrderHistoryServlet")
public class OrderHistoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        User user = (User) session.getAttribute("loggedInUser");

        if(user == null) {

            res.sendRedirect("Login.html");
            return;
        }

        OrderTableDAO dao = new OrderTableDAOImpl();

        List<OrderTable> orders =
                dao.getOrdersByUserId(user.getUserId());
        req.setAttribute("orders", orders);

        req.getRequestDispatcher("orderHistory.jsp")
           .forward(req, res);
    }
}