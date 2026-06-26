package com.tap.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tap.dao.OrderTableDAO;
import com.tap.model.OrderTable;
import com.tap.utility.DBConnection;

public class OrderTableDAOImpl implements
OrderTableDAO {

	@Override
	
	public int addOrder(OrderTable order) {

	    int orderId = 0;

	    String sql = "INSERT INTO ordertable(userId,restaurantId,orderDate,totalAmount,status,paymentMethod) VALUES(?,?,?,?,?,?)";

	    try(Connection con = DBConnection.getConnection();
	        PreparedStatement pstmt =
	        con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

	        pstmt.setInt(1, order.getUserId());
	        pstmt.setInt(2, order.getRestaurantId());
	        pstmt.setTimestamp(3, order.getOrderDate());
	        pstmt.setDouble(4, order.getTotalAmount());
	        pstmt.setString(5, order.getStatus());
	        pstmt.setString(6, order.getPaymentMethod());

	        pstmt.executeUpdate();

	        ResultSet rs = pstmt.getGeneratedKeys();

	        if(rs.next()) {
	            orderId = rs.getInt(1);
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }

	    return orderId;
	}

	@Override
	public OrderTable getOrder(int id) {

		OrderTable order = null;

		String query =
				"select * from ordertable where orderID=?";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			stmt.setInt(1, id);

			ResultSet res =
					stmt.executeQuery();

			if(res.next()) {

				order = new OrderTable();

				order.setOrderId(
						res.getInt("orderID"));

				order.setUserId(
						res.getInt("userID"));

				order.setRestaurantId(
						res.getInt("restaurantID"));

				order.setOrderDate(
						res.getTimestamp("orderDate"));

				order.setTotalAmount(
						res.getDouble("totalAmount"));

				order.setStatus(
						res.getString("status"));

				order.setPaymentMethod(
						res.getString("paymentMethod"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return order;
	}
	@Override
	public List<OrderTable> getOrdersByUserId(int userId) {

	    List<OrderTable> orders = new ArrayList<>();

	    String query =
	        "SELECT * FROM ordertable WHERE userId=? ORDER BY orderDate DESC";

	    try {

	        Connection con = DBConnection.getConnection();

	        PreparedStatement stmt = con.prepareStatement(query);

	        stmt.setInt(1, userId);

	        ResultSet rs = stmt.executeQuery();

	        while(rs.next()) {

	            OrderTable order = new OrderTable();

	            order.setOrderId(rs.getInt("orderId"));
	            order.setUserId(rs.getInt("userId"));
	            order.setRestaurantId(rs.getInt("restaurantId"));
	            order.setOrderDate(rs.getTimestamp("orderDate"));
	            order.setTotalAmount(rs.getDouble("totalAmount"));
	            order.setStatus(rs.getString("status"));
	            order.setPaymentMethod(rs.getString("paymentMethod"));

	            orders.add(order);
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }

	    return orders;
	}

	@Override
	public void updateOrder(OrderTable order) {

		String query =
		"update ordertable set userID=?,restaurantID=?,orderDate=?,totalAmount=?,status=?,paymentMethod=? where orderID=?";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			stmt.setInt(1, order.getUserId());
			stmt.setInt(2, order.getRestaurantId());
			stmt.setTimestamp(3, order.getOrderDate());
			stmt.setDouble(4, order.getTotalAmount());
			stmt.setString(5, order.getStatus());
			stmt.setString(6, order.getPaymentMethod());
			stmt.setInt(7, order.getOrderId());

			int x = stmt.executeUpdate();

			System.out.println(x + " row updated");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteOrder(int id) {

		String query =
				"delete from ordertable where orderID=?";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			stmt.setInt(1, id);

			int x = stmt.executeUpdate();

			System.out.println(x + " row deleted");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<OrderTable> getAllOrder() {

		List<OrderTable> orderList =
				new ArrayList<>();

		String query =
				"select * from ordertable";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			ResultSet res =
					stmt.executeQuery();

			while(res.next()) {

				OrderTable order =
						new OrderTable();

				order.setOrderId(
						res.getInt("orderID"));

				order.setUserId(
						res.getInt("userID"));

				order.setRestaurantId(
						res.getInt("restaurantID"));

				order.setOrderDate(
						res.getTimestamp("orderDate"));

				order.setTotalAmount(
						res.getDouble("totalAmount"));

				order.setStatus(
						res.getString("status"));

				order.setPaymentMethod(
						res.getString("paymentMethod"));

				orderList.add(order);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return orderList;
	}
}