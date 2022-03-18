package com.webapp.InventoryProject;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.webapp.InventoryProject.entities.Order;
import com.webapp.InventoryProject.repos.OrderRepo;

@SpringBootTest

public class OrderServiceJunitTest {
	@Autowired
	OrderRepo orderRepository;

	@Test
	public void createOrderJunitTest() {
		Order order = new Order(1, "26/01/99", 2, 3);
		orderRepository.save(order);
		assertNotNull(orderRepository.findById(1).get());

	}
}
