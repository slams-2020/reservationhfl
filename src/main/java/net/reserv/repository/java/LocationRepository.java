package net.reserv.repository.java;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reserv.models.Location;


public interface LocationRepository extends JpaRepository<Location, Integer> {

	List<Location> findByid_name(int id_location);
	List<Location> findByemail(String gps);
	List<Location> findBypassword(String address1);
	List<Location> findByfistname(String address2);
	
}