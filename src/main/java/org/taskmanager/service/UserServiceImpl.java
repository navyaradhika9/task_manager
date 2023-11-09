package org.taskmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskmanager.model.User;
import org.taskmanager.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User getUser(Integer id) {
		System.out.println("Id:::: "+id);
		System.out.println(userRepository.findById(id));
		return userRepository.findById(id).get();
	}
	
	public User addUser(User user) {
		return userRepository.saveAndFlush(user);
	}

	public User loginUser(User user) {
		System.out.println("User email : "+user.getMail());
		User loggedInUser = userRepository.findByMail(user.getMail());
		if (loggedInUser != null && user.getPassword().equals(loggedInUser.getPassword()))
			return loggedInUser;
		else
			return null;
	}

}
