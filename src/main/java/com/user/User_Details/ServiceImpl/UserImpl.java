package com.user.User_Details.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.User_Details.Entity.User;
import com.user.User_Details.Repository.UserRepository;
import com.user.User_Details.Service.UserService;

@Service
public class UserImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	

	@Override
	public List<User> getAll() {
		
		return userRepo.findAll();
	}

	@Override
	public User getById(Long id) {
		return userRepo.findById(id).orElseThrow(()->new RuntimeException("source not found with id"+id));
		 
	}

	@Override
	public User createUser(User user) {
		
		return userRepo.save(user);
	}

	

	@Override
	public void deletebyId(Long id) {
		
		userRepo.deleteById(id);
		
	}

	@Override
	public User updateUser(Long id, User updatedUser) {
		User user = userRepo.findById(id).orElseThrow(()->new RuntimeException("source not found with id"+id));
		user.setName(updatedUser.getName());
		user.setEmail(updatedUser.getEmail());
		user.setAddress(updatedUser.getAddress());
		return userRepo.save(updatedUser);
	}

}
