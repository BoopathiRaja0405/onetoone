package com.example.demotable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demotable.model.Address;
import com.example.demotable.model.User;
import com.example.demotable.service.AddressService;
import com.example.demotable.service.UserService;

public class HomeController {
	
	@Autowired
	UserService u;
	@Autowired
	AddressService s;
	
	@RequestMapping("/")
	public String index() {
		return "reg";
	}
	
	@RequestMapping("/add")
	public String index1() {
		return "Address";
	}
	
	@PostMapping("/save1")//1,'besant'
	public String get1(@ModelAttribute("User") User us) {
		u.save(us);
		return "Address"; //address.html
	}
	@PostMapping("/save2") //1,'new street'
	public String get2(@ModelAttribute("Address") Address a) {
		s.save(a);
		return "success";//success.html
	}
	

}
