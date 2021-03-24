package com.example.jpaSecurityDemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.jpaSecurityDemo.model.User;

public interface UserCredRepo extends JpaRepository<User, Integer>{

	@Query("SELECT q FROM User q WHERE q.username = :username")
	public Optional<User> findByUserN(@Param("username") String username);
}
