package com.vaishu.service;

import java.util.List;

import com.vaishu.model.Role;
import com.vaishu.model.User;

public interface UserService {

	public User getUser(String username);

	void addRoleToUser(String username, String roleName);

	Role saveRole(Role role);

	List<User> getUsers();

	User saveUser(User user);

}
