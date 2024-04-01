package com.rs.officemanagement.service;

import com.rs.officemanagement.entity.User;

public interface UserService {

	public User saveUser(User user);

	public void removeSessionMessage();

}