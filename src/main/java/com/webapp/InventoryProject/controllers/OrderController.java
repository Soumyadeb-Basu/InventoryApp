package com.webapp.InventoryProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.InventoryProject.entities.Order;
import com.webapp.InventoryProject.services.OrderService;

@RestController
@RequestMapping("demo/order/v1")
public class OrderController {

	@Autowired
	OrderService o_service;

	@GetMapping("/publish")
	public List<Order> getOrders()
	{
		return o_service.getOrders();
	}
	
	@PostMapping("/save")
	public Order addOrder(@RequestBody Order order)
	{
		return o_service.addOrder(order);
	}

}
