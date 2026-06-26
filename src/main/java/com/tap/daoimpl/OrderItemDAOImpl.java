package com.tap.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tap.dao.OrderItemDAO;
import com.tap.model.OrderItem;
import com.tap.utility.DBConnection;

public class OrderItemDAOImpl implements OrderItemDAO {

	@Override
	public void addOrderItem(OrderItem orderItem) {

		String query =
		"insert into orderitem(orderID,menuID,quantity,itemTotal) values(?,?,?,?)";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			stmt.setInt(1, orderItem.getOrderId());
			stmt.setInt(2, orderItem.getMenuId());
			stmt.setInt(3, orderItem.getQuantity());
			stmt.setDouble(4, orderItem.getItemTotal());

			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public OrderItem getOrderItem(int id) {

		OrderItem orderItem = null;

		String query =
				"select * from orderitem where orderItemID=?";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			stmt.setInt(1, id);

			ResultSet res =
					stmt.executeQuery();

			if(res.next()) {

				orderItem = new OrderItem();

				orderItem.setOrderItemId(
						res.getInt("orderItemID"));

				orderItem.setOrderId(
						res.getInt("orderID"));

				orderItem.setMenuId(
						res.getInt("menuID"));

				orderItem.setQuantity(
						res.getInt("quantity"));

				orderItem.setItemTotal(
						res.getDouble("itemTotal"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return orderItem;
	}

	@Override
	public void updateOrderItem(OrderItem orderItem) {

		String query =
		"update orderitem set orderID=?,menuID=?,quantity=?,itemTotal=? where orderItemID=?";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			stmt.setInt(1, orderItem.getOrderId());
			stmt.setInt(2, orderItem.getMenuId());
			stmt.setInt(3, orderItem.getQuantity());
			stmt.setDouble(4, orderItem.getItemTotal());
			stmt.setInt(5, orderItem.getOrderItemId());

			int x = stmt.executeUpdate();

			System.out.println(x + " row updated");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteOrderItem(int id) {

		String query =
				"delete from orderitem where orderItemID=?";

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
	public List<OrderItem> getAllOrderItem() {

		List<OrderItem> orderItemList =
				new ArrayList<>();

		String query =
				"select * from orderitem";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			ResultSet res =
					stmt.executeQuery();

			while(res.next()) {

				OrderItem orderItem =
						new OrderItem();

				orderItem.setOrderItemId(
						res.getInt("orderItemID"));

				orderItem.setOrderId(
						res.getInt("orderID"));

				orderItem.setMenuId(
						res.getInt("menuID"));

				orderItem.setQuantity(
						res.getInt("quantity"));

				orderItem.setItemTotal(
						res.getDouble("itemTotal"));

				orderItemList.add(orderItem);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return orderItemList;
	}
}