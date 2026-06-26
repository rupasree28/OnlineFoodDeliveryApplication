
package com.tap.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection con;

	private static final String URL =
			"jdbc:mysql://localhost:3306/fooddeliveryapp";

	private static final String USERNAME = "root";

	private static final String PASSWORD = "root";

	public static Connection getConnection() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			System.out.println("Connection Established");

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return con;
	}
}