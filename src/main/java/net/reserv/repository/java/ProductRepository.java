package net.reserv.repository.java;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reserv.models.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

	
}
