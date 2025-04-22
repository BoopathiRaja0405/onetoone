package com.example.demotable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demotable.dao.UserResp;
import com.example.demotable.model.User;

@Service
public class UserService {
	@Autowired
	private UserResp userresp;
	
	public User save(User b) {
		return userresp.save(b);
	}

}
