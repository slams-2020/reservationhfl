package net.reserv.repository.java;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reserv.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByid_name(int id_user);
	List<User> findByemail(String email);
	List<User> findBypassword(String password);
	List<User> findByfistname(String firstname);
	List<User> findBylastname(String lastname);
}
