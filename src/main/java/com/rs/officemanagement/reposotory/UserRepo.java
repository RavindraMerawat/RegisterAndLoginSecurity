package com.rs.officemanagement.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.officemanagement.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(String emaill);

}