package com.tap.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        String name = req.getParameter("Username");
        String pwd = req.getParameter("pwd");

        out.println("Name: " + name);
        out.println("Password: " + pwd);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/fooddeliveryapp",
                    "root",
                    "root");

          //  out.println("<br>Connection Success");

            PreparedStatement stmt = con.prepareStatement(
                    "INSERT INTO `user` (userName,password) VALUES (?,?)");

            stmt.setString(1, name);
            stmt.setString(2, pwd);

            int rows = stmt.executeUpdate();

        //    out.println("<br>Rows Inserted: " + rows);

        }
        catch (Exception e) {

            out.println("<br>ERROR:");
            out.println(e.getMessage());

            e.printStackTrace();
        }
    }
}