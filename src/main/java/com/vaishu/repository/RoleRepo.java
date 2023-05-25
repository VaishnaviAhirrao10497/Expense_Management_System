package com.vaishu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaishu.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{
	Role findByName(String name);
}
