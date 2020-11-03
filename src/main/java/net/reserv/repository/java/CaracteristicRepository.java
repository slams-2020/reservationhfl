package net.reserv.repository.java;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

import net.reserv.models.Caracteristic;


=======
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import net.reserv.models.Caracteristic;

@EnableJpaRepositories
>>>>>>> 9dce9ae89c21b918d936a9f82d6a71fdfba04a1b
public interface CaracteristicRepository extends JpaRepository<Caracteristic, Integer> {

	List<Caracteristic> findByid_carateritic(int id_caracteristic);
	List<Caracteristic> findBylabel(String label);
	
}
