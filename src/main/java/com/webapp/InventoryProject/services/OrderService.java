package com.webapp.InventoryProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.webapp.InventoryProject.entities.Order;
import com.webapp.InventoryProject.repos.OrderRepo;

@Service
public class OrderService {

	@Autowired
	OrderRepo o_repo;

	public List<Order> getOrders() {
		List<Order> orders = (List<Order>) o_repo.findAll();
		return orders;
	}
	
	public Order addOrder(Order order)
	{
		return o_repo.save(order);
		
	}
}
