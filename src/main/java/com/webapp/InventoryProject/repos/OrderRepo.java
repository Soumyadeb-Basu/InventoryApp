package com.webapp.InventoryProject.repos;

import org.springframework.data.repository.CrudRepository;

import com.webapp.InventoryProject.entities.Order;

public interface OrderRepo extends CrudRepository<Order, Integer> {

}
