package com.repository;

import com.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	
	//public User save(User user, Long Primarykey);
}
