package com.tap.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

import com.tap.dao.RestaurantDAO;
import com.tap.model.Restaurant;
import com.tap.utility.DBConnection;

public class RestaurantDAOImpl implements RestaurantDAO{

	String insert_query=
	"insert into restaurant "
	+ "(restaurantName,cuisineType,deliveryTime,address,adminUserId,rating,isActive) "
	+ "values(?,?,?,?,?,?,?)";

	String select_query=
	"select * from restaurant where restaurantId=?";

	String select_all_query=
	"select * from restaurant";

	String update_query=
	"update restaurant set "
	+ "restaurantName=?,"
	+ "cuisineType=?,"
	+ "deliveryTime=?,"
	+ "address=?,"
	+ "adminUserId=?,"
	+ "rating=?,"
	+ "isActive=? "
	+ "where restaurantId=?";

	String delete_query=
	"delete from restaurant where restaurantId=?";

	@Override
	public void addRestaurant(Restaurant restaurant) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

		}
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		Connection con=DBConnection.getConnection();

		try {

			PreparedStatement stmt=
			con.prepareStatement(insert_query);

			stmt.setString(1,
			restaurant.getRestaurantName());

			stmt.setString(2,
			restaurant.getCuisineType());

			stmt.setInt(3,
			restaurant.getDeliveryTime());

			stmt.setString(4,
			restaurant.getAddress());

			stmt.setInt(5,
			restaurant.getAdminUserId());

			stmt.setFloat(6,
			restaurant.getRating());

			stmt.setInt(7,
			restaurant.getIsActive());

			stmt.executeUpdate();

			System.out.println("Restaurant Added");

		}
		catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public Restaurant getRestaurant(int id) {
		Restaurant restaurant = null;

		String query =
				"select * from restaurant where restaurantId=?";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			stmt.setInt(1, id);

			ResultSet res =
					stmt.executeQuery();

			if(res.next()) {

				restaurant = new Restaurant();

				restaurant.setRestaurantId(
						res.getInt("restaurantId"));

				restaurant.setRestaurantName(
						res.getString("restaurantName"));

				restaurant.setCuisineType(
						res.getString("cuisineType"));

				restaurant.setDeliveryTime(
						res.getInt("deliveryTime"));

				restaurant.setAddress(
						res.getString("address"));

				restaurant.setAdminUserId(
						res.getInt("adminUserID"));

				restaurant.setRating(
						res.getFloat("rating"));

				restaurant.setIsActive(
						res.getInt("isActive"));
				restaurant.setImage(
				        res.getString("image"));                    
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return restaurant;

	
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		
		String query =
				"update restaurant set restaurantName=?,cuisineType=?,deliveryTime=?,address=?,adminUserID=?,rating=?,isActive=? where restaurantID=?";

				try {

					Connection con =
							DBConnection.getConnection();

					PreparedStatement stmt =
							con.prepareStatement(query);

					stmt.setString(1, restaurant.getRestaurantName());
					stmt.setString(2, restaurant.getCuisineType());
					stmt.setInt(3, restaurant.getDeliveryTime());
					stmt.setString(4, restaurant.getAddress());
					stmt.setInt(5, restaurant.getAdminUserId());
					stmt.setFloat(6, restaurant.getRating());
					stmt.setInt(7, restaurant.getIsActive());
					stmt.setInt(8, restaurant.getRestaurantId());

					int x = stmt.executeUpdate();

					System.out.println(x + " row updated");

				} catch (Exception e) {
					e.printStackTrace();
				}
		

	}

	@Override
	public void deleteRestaurant(int id) {

		String query =
				"delete from restaurant where restaurantId=?";

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
	public List<Restaurant> getAllRestaurant() {

		List<Restaurant> restaurantList =
				new ArrayList<>();

		String query =
				"select * from restaurant";

		try {

			Connection con =
					DBConnection.getConnection();

			PreparedStatement stmt =
					con.prepareStatement(query);

			ResultSet res =
					stmt.executeQuery();

			while(res.next()) {

				Restaurant restaurant =
						new Restaurant();

				restaurant.setRestaurantId(
						res.getInt("restaurantId"));

				restaurant.setRestaurantName(
						res.getString("restaurantName"));

				restaurant.setCuisineType(
						res.getString("cuisineType"));

				restaurant.setDeliveryTime(
						res.getInt("deliveryTime"));

				restaurant.setAddress(
						res.getString("address"));

				restaurant.setAdminUserId(
						res.getInt("adminUserId"));

				restaurant.setRating(
						res.getFloat("rating"));

				restaurant.setIsActive(
						res.getInt("isActive"));
				restaurant.setImage(
				        res.getString("image"));

				restaurantList.add(restaurant);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return restaurantList;
	}
}