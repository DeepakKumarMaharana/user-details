package com.user.User_Details.Service;

import java.util.List;

import com.user.User_Details.Entity.User;

public interface UserService {
	
	List<User>getAllUser();
	User getById(Long id);
	User createUser(User user);
	User updateUser (Long id, User updatedUser);
	void deletebyId(Long id);
}
