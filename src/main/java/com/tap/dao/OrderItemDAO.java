package com.tap.dao;

import java.util.List;
import com.tap.model.OrderItem;

public interface OrderItemDAO {

	void addOrderItem(OrderItem orderItem);

	OrderItem getOrderItem(int id);

	void updateOrderItem(OrderItem orderItem);

	void deleteOrderItem(int id);

	List<OrderItem> getAllOrderItem();
}