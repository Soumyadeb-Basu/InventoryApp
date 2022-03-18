package com.webapp.InventoryProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.webapp.InventoryProject.entities.Product;
import com.webapp.InventoryProject.repos.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo prrepo;

	public List<Product> getProducts() {
		List<Product> prlist = (List<Product>) prrepo.findAll();
		return prlist;

	}

	public Product getProduct(int id) {
		Optional<Product> p = prrepo.findById(id);
		if (p.isPresent())
			return p.get();
		else
			return new Product();
	}

	public Product addProduct(Product product)
	{
		return prrepo.save(product);
	}

	public void deleteProduct(int id)
	{
		prrepo.deleteById(id);
	}

}
