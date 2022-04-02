package com.webapp.InventoryProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.InventoryProject.entities.Order;
import com.webapp.InventoryProject.services.OrderService;

@RestController
@RequestMapping("demo/orders/v1")
public class OrderController {

	@Autowired
	OrderService o_service;

	@GetMapping("/publish")
	public List<Order> getOrders() {
		return o_service.getOrders();
	}

	@PostMapping("/save")
	public Order addOrder(@RequestBody Order order) {
		return o_service.addOrder(order);
	}

	@GetMapping("/publish/{id}")
	public Order getOrder(@PathVariable int id) {
		return o_service.getOrder(id);
	}
	
	@DeleteMapping("/remove/{id}")
	public void removeOrder(@PathVariable int id) {
		o_service.remove(id);
	}
}
