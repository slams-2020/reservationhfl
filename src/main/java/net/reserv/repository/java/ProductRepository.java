package net.reserv.repository.java;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import net.reserv.models.Product;

@EnableJpaRepositories
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByid_name(int id_product);

	List<Product> findByemail(String type);

	List<Product> findBypassword(String title);

	List<Product> findByfistname(String description);

	List<Product> findBylastname(String price);

}
