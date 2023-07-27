package com.tcm.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcm.crud.deo.UserRepository;
import com.tcm.crud.entity.User;

@Service
public class UserService { 
	
@Autowired	
private UserRepository userRepository;

public User createUser(User user) {
	return userRepository.save(user);
}
public List<User> createUsers(List<User> users) {
	return userRepository.saveAll(users);

}

public User getUserById(int id) {
	return userRepository.findById(id).orElse(null);
}

public List<User> getUsers() {
	return userRepository.findAll();
}

public User updateUser(User user) {
	User oldUser=null;
	Optional<User> optionaluser=userRepository.findById(user.getId());
	if(optionaluser.isPresent()) {
		User oldUser1=optionaluser.get();
		oldUser1.setName(user.getName());
		oldUser1.setEmail_adress(user.getEmail_adress());
		userRepository.save(oldUser1);	
	}else {
		return new User();
	}
	return oldUser;
}
public String deleteUserById(int id) {
	userRepository.deleteById(id);
	return "User got Deleted";
}

}
