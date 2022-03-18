package com.webapp.InventoryProject.repos;

import org.springframework.data.repository.CrudRepository;

import com.webapp.InventoryProject.entities.Product;


public interface ProductRepo extends CrudRepository<Product, Integer> {

}
