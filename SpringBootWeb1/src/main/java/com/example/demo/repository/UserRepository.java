package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer>
{
	<User> com.example.demo.entities.User findByEmail(String email);
}

