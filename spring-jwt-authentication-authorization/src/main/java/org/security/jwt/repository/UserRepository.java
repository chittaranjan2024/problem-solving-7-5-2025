package org.security.jwt.repository;

import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	
	Optional<User> findUserByUserNameOrEmail(String username,String email);
	
}
