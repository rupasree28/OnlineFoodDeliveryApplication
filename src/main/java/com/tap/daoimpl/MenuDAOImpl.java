package com.tap.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tap.dao.MenuDAO;
import com.tap.model.Menu;
import com.tap.utility.DBConnection;

public class MenuDAOImpl implements MenuDAO {
	
	
	@Override
	public List<Menu> getAllMenuByRestaurantId(int restaurant_id) {

	    List<Menu> menuList = new ArrayList<>();

	    String query = "SELECT * FROM menu WHERE restaurantId=?";

	    try {

	        Connection con = DBConnection.getConnection();

	        PreparedStatement stmt = con.prepareStatement(query);

	        // THIS WAS MISSING
	        stmt.setInt(1, restaurant_id);

	        ResultSet res = stmt.executeQuery();

	        while (res.next()) {

	            Menu menu = new Menu();

	            menu.setMenuId(res.getInt("menuID"));
	            menu.setRestaurantId(res.getInt("restaurantID"));
	            menu.setItemName(res.getString("itemName"));
	            menu.setDescription(res.getString("description"));
	            menu.setPrice(res.getDouble("price"));
	            menu.setIsAvailable(res.getInt("isAvailable"));
	            menu.setCategory(res.getString("category"));
	            menu.setCreatedAt(res.getTimestamp("createdAt"));
	            menu.setUpdatedAt(res.getTimestamp("updatedAt"));
	            menu.setDeletedAt(res.getTimestamp("deletedAt"));
	            menu.setImage(res.getString("image"));

	            menuList.add(menu);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return menuList;
	}
	@Override
	
	public void addMenu(Menu menu) {

	    String query = "INSERT INTO menu(restaurantID,itemName,description,price,isAvailable,category,createdAt,updatedAt,deletedAt,image) VALUES(?,?,?,?,?,?,?,?,?,?)";

	    try {

	        Connection con = DBConnection.getConnection();

	        PreparedStatement stmt = con.prepareStatement(query);

	        stmt.setInt(1, menu.getRestaurantId());
	        stmt.setString(2, menu.getItemName());
	        stmt.setString(3, menu.getDescription());
	        stmt.setDouble(4, menu.getPrice());
	        stmt.setInt(5, menu.getIsAvailable());
	        stmt.setString(6, menu.getCategory());
	        stmt.setTimestamp(7, menu.getCreatedAt());
	        stmt.setTimestamp(8, menu.getUpdatedAt());
	        stmt.setTimestamp(9, menu.getDeletedAt());
	        stmt.setString(10, menu.getImage());

	        int x = stmt.executeUpdate();

	        System.out.println(x + " row inserted");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public Menu getMenu(int id) {

		Menu menu = null;

		String query =
				"select * from menu where menuID=?";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			stmt.setInt(1, id);

			ResultSet res =
					stmt.executeQuery();

			if(res.next()) {

				menu = new Menu();

				menu.setMenuId(
						res.getInt("menuID"));

				menu.setRestaurantId(
						res.getInt("restaurantID"));

				menu.setItemName(
						res.getString("itemName"));

				menu.setDescription(
						res.getString("description"));

				menu.setPrice(
						res.getDouble("price"));

				menu.setIsAvailable(
						res.getInt("isAvailable"));

				menu.setCategory(
						res.getString("category"));

				menu.setCreatedAt(
						res.getTimestamp("createdAt"));

				menu.setUpdatedAt(
						res.getTimestamp("updatedAt"));

				menu.setDeletedAt(
						res.getTimestamp("deletedAt"));
				menu.setImage(res.getString("image"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return menu;
	}

	@Override

	public void updateMenu(Menu menu) {

	    String query = "UPDATE menu SET restaurantID=?,itemName=?,description=?,price=?,isAvailable=?,category=?,createdAt=?,updatedAt=?,deletedAt=?,image=? WHERE menuID=?";

	    try {

	        Connection con = DBConnection.getConnection();

	        PreparedStatement stmt = con.prepareStatement(query);

	        stmt.setInt(1, menu.getRestaurantId());
	        stmt.setString(2, menu.getItemName());
	        stmt.setString(3, menu.getDescription());
	        stmt.setDouble(4, menu.getPrice());
	        stmt.setInt(5, menu.getIsAvailable());
	        stmt.setString(6, menu.getCategory());
	        stmt.setTimestamp(7, menu.getCreatedAt());
	        stmt.setTimestamp(8, menu.getUpdatedAt());
	        stmt.setTimestamp(9, menu.getDeletedAt());
	        stmt.setString(10, menu.getImage());
	        stmt.setInt(11, menu.getMenuId());

	        int x = stmt.executeUpdate();

	        System.out.println(x + " row updated");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void deleteMenu(int id) {

		String query =
				"delete from menu where menuID=?";

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
	public List<Menu> getAllMenu() {

		List<Menu> menuList =
				new ArrayList<>();

		String query =
				"select * from menu";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			ResultSet res =
					stmt.executeQuery();

			while(res.next()) {

				Menu menu = new Menu();

				menu.setMenuId(
						res.getInt("menuID"));

				menu.setRestaurantId(
						res.getInt("restaurantID"));

				menu.setItemName(
						res.getString("itemName"));

				menu.setDescription(
						res.getString("description"));

				menu.setPrice(
						res.getDouble("price"));

				menu.setIsAvailable(
						res.getInt("isAvailable"));

				menu.setCategory(
						res.getString("category"));

				menu.setCreatedAt(
						res.getTimestamp("createdAt"));

				menu.setUpdatedAt(
						res.getTimestamp("updatedAt"));

				menu.setDeletedAt(
						res.getTimestamp("deletedAt"));
				menu.setImage(res.getString("image"));

				menuList.add(menu);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return menuList;
	}
}