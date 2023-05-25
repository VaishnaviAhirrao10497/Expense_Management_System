package com.vaishu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaishu.model.User;

public interface UserRepo extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
