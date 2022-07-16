package com.coderscampus.repository;

import java.util.Set;
import java.util.TreeSet;

import com.coderscampus.domain.User;

public class UserRepository {
	private Set<User> users = new TreeSet<>();
	
	public User save (User user) {
		if (users.size() == 0) {
			user.setId(1L);
		} else  {
			User lastUser = ((TreeSet<User>)users).last();
			user.setId(lastUser.getId());
		}
		users.add(user);
		return user;
	}
}
