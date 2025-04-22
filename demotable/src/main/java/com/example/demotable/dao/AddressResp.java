package com.example.demotable.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demotable.model.Address;

public interface AddressResp extends JpaRepository<Address,Integer> {

	

}
