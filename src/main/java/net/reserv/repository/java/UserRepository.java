package net.reserv.repository.java;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

import net.reserv.models.User;

=======
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import net.reserv.models.User;
@EnableJpaRepositories
>>>>>>> 9dce9ae89c21b918d936a9f82d6a71fdfba04a1b
public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByid_name(int id_user);
	List<User> findByemail(String email);
	List<User> findBypassword(String password);
	List<User> findByfistname(String firstname);
	List<User> findBylastname(String lastname);
}
