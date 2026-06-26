package com.tap.utility;

import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

import com.tap.daoimpl.MenuDAOImpl;
import com.tap.daoimpl.OrderItemDAOImpl;
import com.tap.daoimpl.OrderTableDAOImpl;
import com.tap.daoimpl.RestaurantDAOImpl;
import com.tap.daoimpl.UserDAOImpl;
import com.tap.model.Menu;
import com.tap.model.OrderItem;
import com.tap.model.OrderTable;
import com.tap.model.Restaurant;
import com.tap.model.User;

public class Launch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		
		
		//USER INSERT
		
//		System.out.println("Enter Username");
//		String username = sc.nextLine();
//
//		System.out.println("Enter Password");
//		String password = sc.nextLine();
//
//		System.out.println("Enter Email");
//		String email = sc.nextLine();
//
//		System.out.println("Enter Address");
//		String address = sc.nextLine();
//
//		System.out.println("Enter Role");
//		String role = sc.nextLine();
//
//		User user = new User(
//				username,
//				password,
//				email,
//				address,
//				role,
//				new Timestamp(System.currentTimeMillis())
//		);
//
//		UserDAOImpl userDao = new UserDAOImpl();
//
//		userDao.addUser(user);
//
//		System.out.println(user);

		
		
		
		// get user
//		UserDAOImpl userDao = new UserDAOImpl();
//
//		User user = userDao.getUser(13);
//
//		System.out.println(user);

		
		
		
		// UPDATE USER 
		
//		UserDAOImpl userDao = new UserDAOImpl();
//
//		User user = userDao.getUser(13);
//
//		user.setAddress("Bangalore");
//
//		userDao.updateUser(user);

		
		
		
		//  DELETE USER
		
//		UserDAOImpl userDao = new UserDAOImpl();
//
//		userDao.deleteUser(1);

		
		
		
		// GET ALL USERS 
		
//		UserDAOImpl userDao = new UserDAOImpl();
//
//		List<User> userList = userDao.getAllUser();
//
//		for(User u : userList) {
//			System.out.println(u);
//		}

		
		
		
		// RESTAURANT INSERT
		
//		System.out.println("Enter Restaurant Name");
//		String name = sc.nextLine();
//
//		System.out.println("Enter Cuisine Type");
//		String cuisineType = sc.nextLine();
//
//		System.out.println("Enter Delivery Time");
//		int deliveryTime = sc.nextInt();
//
//		sc.nextLine();
//
//		System.out.println("Enter Address");
//		String address = sc.nextLine();
//
//		System.out.println("Enter Admin User ID");
//		int adminUserId = sc.nextInt();
//
//		System.out.println("Enter Rating");
//		float rating = sc.nextFloat();
//
//		System.out.println("Enter Is Active");
//		int isActive = sc.nextInt();
//
//		Restaurant restaurant = new Restaurant(
//				name,
//				cuisineType,
//				deliveryTime,
//				address,
//				adminUserId,
//				rating,
//				isActive
//		);
//
//		RestaurantDAOImpl restaurantDao =
//				new RestaurantDAOImpl();
//
//		restaurantDao.addRestaurant(restaurant);
//
//		System.out.println(restaurant);

		
		
		
		// GET RESTAURANT BY ID 
//		
//		RestaurantDAOImpl restaurantDao =
//				new RestaurantDAOImpl();
//
//		Restaurant restaurant =
//				restaurantDao.getRestaurant(1);
//
//		System.out.println(restaurant);

		
		
		
		//  UPDATE RESTAURANT
		
//		RestaurantDAOImpl restaurantDao =
//				new RestaurantDAOImpl();
//
//		Restaurant restaurant =
//				restaurantDao.getRestaurant(1);
//
//		restaurant.setRestaurantName("bawarcha");
//		restaurant.setCuisineType("veg");
//
//		restaurantDao.updateRestaurant(restaurant);

		
		
		
		// DELETE RESTAURANT
		
//		RestaurantDAOImpl restaurantDao =
//				new RestaurantDAOImpl();
//
//		restaurantDao.deleteRestaurant(5);

		
		
		
		//GET ALL RESTAURANTS 
		
		RestaurantDAOImpl restaurantDao =
				new RestaurantDAOImpl();

		List<Restaurant> restaurantList =
				restaurantDao.getAllRestaurant();

		for(Restaurant r : restaurantList) {
			System.out.println(r);
		}

		
		
		
		//  MENU INSERT 
		
//		System.out.println("Enter Restaurant ID");
//		int restaurantId = sc.nextInt();
//
//		sc.nextLine();
//
//		System.out.println("Enter Item Name");
//		String itemName = sc.nextLine();
//
//		System.out.println("Enter Description");
//		String description = sc.nextLine();
//
//		System.out.println("Enter Price");
//		double price = sc.nextDouble();
//
//		System.out.println("Enter Is Available");
//		int isAvailable = sc.nextInt();
//
//		sc.nextLine();
//
//		System.out.println("Enter Category");
//		String category = sc.nextLine();
//
//		Menu menu = new Menu(
//				restaurantId,
//				itemName,
//				description,
//				price,
//				isAvailable,
//				category,
//				new Timestamp(System.currentTimeMillis()),
//				new Timestamp(System.currentTimeMillis()),
//				null
//		);
//
//		MenuDAOImpl menuDao = new MenuDAOImpl();
//
//		menuDao.addMenu(menu);
//
//		System.out.println(menu);

		
		
		
		//  GET MENU BY ID 
//		
//		MenuDAOImpl menuDao = new MenuDAOImpl();
//
//		Menu menu = menuDao.getMenu(1);
//
//		System.out.println(menu);

		
		
		
		// ================= UPDATE MENU =================
//		
//		MenuDAOImpl menuDao = new MenuDAOImpl();
//
//		Menu menu = menuDao.getMenu(1);
//
//		menu.setPrice(499);
//
//		menuDao.updateMenu(menu);

		
		
		
		// ================= DELETE MENU =================
		
//		MenuDAOImpl menuDao = new MenuDAOImpl();
//
//		menuDao.deleteMenu(2);

		
		
		
		// ================= GET ALL MENU =================
		
//		MenuDAOImpl menuDao = new MenuDAOImpl();
//
//		List<Menu> menuList = menuDao.getAllMenu();
//
//		for(Menu m : menuList) {
//			System.out.println(m);
//		}

		
		
		
		// ================= ORDER ITEM INSERT =================
		
//		System.out.println("Enter Order ID");
//		int orderId = sc.nextInt();
//
//		System.out.println("Enter Menu ID");
//		int menuId = sc.nextInt();
//
//		System.out.println("Enter Quantity");
//		int quantity = sc.nextInt();
//
//		System.out.println("Enter Item Total");
//		double itemTotal = sc.nextDouble();
//
//		OrderItem orderItem = new OrderItem(
//				orderId,
//				menuId,
//				quantity,
//				itemTotal
//		);
//		OrderItemDAOImpl orderItemDao =
//				new OrderItemDAOImpl();
//
//		orderItemDao.addOrderItem(orderItem);
//
//		System.out.println(orderItem);

		
		
		
		//  GET ORDER ITEM BY ID 
		
//		OrderItemDAOImpl orderItemDao =
//				new OrderItemDAOImpl();
//
//		OrderItem orderItem =
//				orderItemDao.getOrderItem(3);
//
//		System.out.println(orderItem);

		
		
		
		// UPDATE ORDER ITEM 
		
//		OrderItemDAOImpl orderItemDao =
//				new OrderItemDAOImpl();
//
//		OrderItem orderItem =
//				orderItemDao.getOrderItem(3);
//
//		orderItem.setQuantity(7);
//
//		orderItemDao.updateOrderItem(orderItem);

		
		
		
		// DELETE ORDER ITEM
		
//		OrderItemDAOImpl orderItemDao =
//				new OrderItemDAOImpl();
//
//		orderItemDao.deleteOrderItem(5);

		
		
		
		//GET ALL ORDER ITEMS 
		
//		OrderItemDAOImpl orderItemDao =
//				new OrderItemDAOImpl();
//
//		List<OrderItem> orderItemList =
//				orderItemDao.getAllOrderItem();
//
//		for(OrderItem oi : orderItemList) {
//			System.out.println(oi);
//		}

		
		
		
		// ORDER TABLE INSERT
//		System.out.println("Enter User ID");
//		int userId = sc.nextInt();
//
//		System.out.println("Enter Restaurant ID");
//		int restaurantId = sc.nextInt();
//
//		sc.nextLine();
//
//		System.out.println("Enter Status");
//		String status = sc.nextLine();
//
//		System.out.println("Enter Payment Method");
//		String paymentMethod = sc.nextLine();
//
//		System.out.println("Enter Total Amount");
//		double totalAmount = sc.nextDouble();
//
//		OrderTable order = new OrderTable(
//				userId,
//				restaurantId,
//				new Timestamp(System.currentTimeMillis()),
//				totalAmount,
//				status,
//				paymentMethod
//		);
//
//		OrderTableDAOImpl orderDao =
//				new OrderTableDAOImpl();
//
//		orderDao.addOrder(order);
//
//		System.out.println(order);

		
		
		
		//  GET ORDER BY ID 
		
//		OrderTableDAOImpl orderDao =
//				new OrderTableDAOImpl();
//
//		OrderTable order =
//				orderDao.getOrder(1);
//
//		System.out.println(order);

		
		
		
		//  UPDATE ORDER
		
//		OrderTableDAOImpl orderDao =
//				new OrderTableDAOImpl();
//
//		OrderTable order =
//				orderDao.getOrder(1);
//
//		order.setStatus("DELIVERED");
//
//		orderDao.updateOrder(order);

		
		
		
		// DELETE ORDER
		
//		OrderTableDAOImpl orderDao =
//				new OrderTableDAOImpl();
//
//		orderDao.deleteOrder(1);

		
		
		
		//  GET ALL ORDERS 
//		OrderTableDAOImpl orderDao =
//				new OrderTableDAOImpl();
//
//		List<OrderTable> orderList =
//				orderDao.getAllOrder();
//
//		for(OrderTable o : orderList) {
//			System.out.println(o);
//		}
	}
}