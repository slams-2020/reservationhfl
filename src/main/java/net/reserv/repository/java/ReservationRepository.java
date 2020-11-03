package net.reserv.repository.java;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reserv.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	
	List<Reservation> findByid_reservation(int id_reservation);
	List<Reservation> findByprice(String price);
	List<Reservation> findBystartdate(String startDate);
	List<Reservation> findByendDate(String endDate);
	
}