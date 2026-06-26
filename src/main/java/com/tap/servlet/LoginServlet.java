package com.tap.servlet;

import java.io.IOException;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import com.tap.daoimpl.UserDAOImpl;
import com.tap.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/callingLoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    	String email = req.getParameter("email");
    	String password = req.getParameter("pwd");

    	UserDAOImpl dao = new UserDAOImpl();

    	User user = dao.getUserByEmail(email);

    	if (user != null && BCrypt.checkpw(password, user.getPassword())) {

    	    HttpSession session = req.getSession();
    	    session.setAttribute("loggedInUser", user);

    	    resp.sendRedirect("home.html");

    	} else {

    	    RequestDispatcher rd = req.getRequestDispatcher("failure.html");
    	    rd.forward(req, resp);
    	} 
    }
}



