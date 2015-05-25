package com.medem.dao;

import java.util.List;

import com.medem.model.User;

public interface UserDAO {

	public void addUser(User user);
	public List<User> listUsers();
	public User getUserById(int id);
	public User getUserByName(String name);
	public User getFullUserByName(String name);
}
