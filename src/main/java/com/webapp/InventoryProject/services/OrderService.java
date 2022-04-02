package com.webapp.InventoryProject.services;

import java.util.List;
import java.util.Optional;

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
	
	public Order getOrder(int id)
	{
		Optional<Order> order=o_repo.findById(id);
		if(order.isPresent())
			return order.get();
		else
			return new Order();

	}
	
	public void remove(int id)
	{
		o_repo.deleteById(id);
	}
}
