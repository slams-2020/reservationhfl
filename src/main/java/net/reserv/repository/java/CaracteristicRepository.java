package net.reserv.repository.java;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import net.reserv.models.Caracteristic;


public interface CaracteristicRepository extends JpaRepository<Caracteristic, Integer> {


}
