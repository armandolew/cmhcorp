package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.UserDAO;
import com.medem.dto.Assembler;
import com.medem.dto.UserDTO;
import com.medem.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public void addUser(User user) {
		this.userDAO.addUser(user);
		
	}

	@Override
	@Transactional
	public List<UserDTO> listUsers() {
		List<UserDTO> listUsersDTO = new ArrayList<UserDTO>();
		try{
			for(User user : userDAO.listUsers()){
				listUsersDTO.add(Assembler.createUserDTO(user));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return listUsersDTO;
	}

	@Override
	@Transactional
	public UserDTO getUserById(int id) {
		return Assembler.createUserDTO(userDAO.getUserById(id));
	}

//	@Override
//	@Transactional
//	public List<UserDTO> getUserByName(String name) {
//		List<UserDTO> searchUser = new ArrayList<UserDTO>();
//		try{
//			for (User user : userDAO.getUserByName(name)){
//				searchUser.add(Assembler.createUserDTO(user));
//			}
//		}
//		catch(Exception e){
//			System.out.println(e);
//		}
//		
//		return searchUser;
//	}
	
	@Override
	@Transactional
	public UserDTO getUserByName(String name){
	    return Assembler.createUserDTO(this.userDAO.getUserByName(name));
	}

    @Override
    public UserDTO getFullUserByName(String name) {
        return Assembler.createUserDTO(this.userDAO.getFullUserByName(name));
    }
	
	
}
