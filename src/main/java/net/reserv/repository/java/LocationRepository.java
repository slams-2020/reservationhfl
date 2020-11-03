package net.reserv.repository.java;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

import net.reserv.models.Location;

=======
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import net.reserv.models.Location;
@EnableJpaRepositories
>>>>>>> 9dce9ae89c21b918d936a9f82d6a71fdfba04a1b

public interface LocationRepository extends JpaRepository<Location, Integer> {

	List<Location> findByid_name(int id_location);
	List<Location> findByemail(String gps);
	List<Location> findBypassword(String address1);
	List<Location> findByfistname(String address2);
	
}
