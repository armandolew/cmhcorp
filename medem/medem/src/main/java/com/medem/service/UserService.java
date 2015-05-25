package com.medem.service;

import java.util.List;

import com.medem.dto.UserDTO;
import com.medem.model.User;

public interface UserService {
	public void addUser(User user);
	public List<UserDTO> listUsers();
	public UserDTO getUserById(int id);
	public UserDTO getUserByName(String name);
	public UserDTO getFullUserByName(String name);
}
