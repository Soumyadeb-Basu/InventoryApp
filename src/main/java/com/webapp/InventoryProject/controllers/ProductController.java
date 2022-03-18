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

import com.webapp.InventoryProject.entities.Product;
import com.webapp.InventoryProject.services.ProductService;

@RestController
@RequestMapping("demo/product/v1")
public class ProductController {

	@Autowired
	ProductService prservice;

	@GetMapping("/publish")
	public List<Product> publishProducts() {
		return prservice.getProducts();
	}

	@GetMapping("/publish/{id}")
	public Product publishproduct(@PathVariable int id) {
		return prservice.getProduct(id);
	}

	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return prservice.addProduct(product);
	}

	@DeleteMapping("/remove/{id}")
	public void removeProduct(@PathVariable int id) {
		prservice.deleteProduct(id);
	}
}
