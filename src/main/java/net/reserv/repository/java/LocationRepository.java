package net.reserv.repository.java;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reserv.models.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

	
}
