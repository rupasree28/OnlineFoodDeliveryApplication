package com.tap.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tap.dao.UserDAO;
import com.tap.model.User;
import com.tap.utility.DBConnection;


public class UserDAOImpl implements UserDAO{
	public int addUser(User user) {
		PreparedStatement stmt;
		int r=0;
		String add_query="insert into user (userName,password,email,address,role) values(?,?,?,?,?)";
		try {
			Connection con=DBConnection.getConnection();
			stmt=con.prepareStatement(add_query);
			stmt.setString(1, user.getUserName());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getAddress());
			stmt.setString(5, user.getRole());
			//
			//stmt.set(6,user.getCreatedDate());
		//	stmt.setTimestamp(6, user.getCreatedDate());
			//stmt.setTimestamp(6,user.getLastLoginDate());
			
		
			
			
			r=stmt.executeUpdate();
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}

	
	
	@Override
	public User getUserByEmail(String email) {

	    User user = null;

	    String query = "select * from user where email=?";

	    try {

	        Connection con = DBConnection.getConnection();

	        PreparedStatement stmt = con.prepareStatement(query);

	        stmt.setString(1, email);

	        ResultSet res = stmt.executeQuery();

	        if (res.next()) {

	            user = new User();

	            user.setUserId(
	                    res.getInt("userId"));

	            user.setUserName(
	                    res.getString("userName"));

	            user.setPassword(
	                    res.getString("password"));

	            user.setEmail(
	                    res.getString("email"));

	            user.setAddress(
	                    res.getString("address"));

	            user.setRole(
	                    res.getString("role"));

	            user.setCreateDate(
	                    res.getTimestamp("createdDate"));

	            user.setLastLoginDate(
	                    res.getTimestamp("lastLoginDate"));
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return user;
	}
	
	@Override
	
	public User getUser(int id) {

	    User user = null;

	    String query = "select * from user where userId=?";

	    try {

	        Connection con = DBConnection.getConnection();

	        PreparedStatement stmt = con.prepareStatement(query);

	        stmt.setInt(1, id);

	        ResultSet res = stmt.executeQuery();

	        if(res.next()) {

	            user = new User();

	            user.setUserId(res.getInt("userId"));
	            user.setUserName(res.getString("userName"));
	            user.setPassword(res.getString("password"));
	            user.setEmail(res.getString("email"));
	            user.setAddress(res.getString("address"));

	            user.setRole(
	                String.valueOf(res.getString("role"))
	            );

	            user.setCreateDate(
	                res.getTimestamp("createdDate")
	            );

	            user.setLastLoginDate(
	                res.getTimestamp("lastLoginDate")
	            );
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }

	    return user;
	}

	@Override
	
	public void updateUser(User user) {

	    String query =
	    "update user set userName=?,password=?,email=?,address=?,role=?,lastLoginDate=? where userId=?";

	    try {

	        Connection con = DBConnection.getConnection();

	        PreparedStatement stmt =
	                con.prepareStatement(query);

	        stmt.setString(1, user.getUserName());
	        stmt.setString(2, user.getPassword());
	        stmt.setString(3, user.getEmail());
	        stmt.setString(4, user.getAddress());

	        stmt.setString(5,
	                user.getRole());

	        stmt.setTimestamp(6,
	                user.getLastLoginDate());

	        stmt.setInt(7, user.getUserId());

	        int x = stmt.executeUpdate();

	        System.out.println(x + " row updated");

	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}
	@Override
	public void deleteUser(int id) {

	    String query =
	            "delete from user where userId=?";

	    try {

	        Connection con =
	                DBConnection.getConnection();

	        PreparedStatement stmt =
	                con.prepareStatement(query);

	        stmt.setInt(1, id);

	        int x = stmt.executeUpdate();

	        System.out.println(x + " row deleted");

	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}

	@Override
	
	public List<User> getAllUser() {

	    List<User> userList = new ArrayList<>();

	    String query = "select * from user";

	    try {

	        Connection con =
	                DBConnection.getConnection();

	        PreparedStatement stmt =
	                con.prepareStatement(query);

	        ResultSet res =
	                stmt.executeQuery();

	        while(res.next()) {

	            User user = new User();

	            user.setUserId(
	                    res.getInt("userId"));

	            user.setUserName(
	                    res.getString("userName"));

	            user.setPassword(
	                    res.getString("password"));

	            user.setEmail(
	                    res.getString("email"));

	            user.setAddress(
	                    res.getString("address"));

	            user.setRole(
	                    String.valueOf(
	                            res.getString("role"))
	            );

	            user.setCreateDate(
	                    res.getTimestamp("createdDate")
	            );

	            user.setLastLoginDate(
	                    res.getTimestamp("lastLoginDate")
	            );

	            userList.add(user);
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }

	    return userList;
	}

	

}
