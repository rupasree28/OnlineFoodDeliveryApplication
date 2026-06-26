package com.tap.dao;

	import java.util.List;

import com.tap.model.User;

public interface UserDAO {
	int addUser(User user);
	User getUser(int id);
	void updateUser(User user);
	void deleteUser(int id);
	List<User> getAllUser();
	User getUserByEmail(String email);
	

}
