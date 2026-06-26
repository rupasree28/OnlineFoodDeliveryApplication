package com.tap.servlet;

import java.io.IOException;

import org.mindrot.jbcrypt.BCrypt;

import com.tap.dao.UserDAO;
import com.tap.daoimpl.UserDAOImpl;
import com.tap.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/callingRegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String username = req.getParameter("Username");
        String password = req.getParameter("pwd");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String role = req.getParameter("role");

        // Hash Password
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(12));

        User user = new User(username, hashedPassword, email, address, role);

        UserDAO dao = new UserDAOImpl();

        int result = dao.addUser(user);

        if (result == 1) {
            res.sendRedirect("Login.html");
        } else {
            res.getWriter().println("Registration Failed");
        }
    }
}