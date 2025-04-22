package com.example.demotable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demotable.dao.AddressResp;
import com.example.demotable.model.Address;

@Service
public class AddressService {
	@Autowired
	private AddressResp a;
	
	public Address save1(Address b) {
		return a.save(b);
	}

	public void save(Address a2) {
		// TODO Auto-generated method stub
		
	}

}
