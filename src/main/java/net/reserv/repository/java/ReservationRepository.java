package net.reserv.repository.java;

import java.util.List;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import net.reserv.models.Reservation;

=======

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import net.reserv.models.Reservation;

@EnableJpaRepositories
>>>>>>> 9dce9ae89c21b918d936a9f82d6a71fdfba04a1b
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	
	List<Reservation> findByid_reservation(int id_reservation);
	List<Reservation> findByprice(String price);
	List<Reservation> findBystartdate(String startDate);
	List<Reservation> findByendDate(String endDate);
	
}
