package co.com.drogueria.security.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.drogueria.security.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);
	
}
