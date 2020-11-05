package net.reserv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import net.reserv.models.Product;
import net.reserv.repository.java.ProductRepository;

@Controller
public class ProductController {

		@Autowired
		
		private ProductRepository repo;
		
		@PostMapping("new")
		@ResponseBody
		public String newProduct(Product products) {
			repo.saveAndFlush(products);
			return products+"ajoutée.";
	}

}
 