package com.kodbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodbook.entity.User;
import com.kodbook.repository.UserRepository;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserRepository uRepo;

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		uRepo.save(user);
	}
	@Override
	public boolean userExists(String username, String email) {
		// TODO Auto-generated method stub
		User user1=uRepo.findByUsername(username);
		User user2=uRepo.findByEmail(email);
		if(user1 != null || user2 != null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		String dbPass=uRepo.findByUsername(username).getPassword();
		if(password.equals(dbPass)) {
			return true;
		}
		return false;
	}

}
