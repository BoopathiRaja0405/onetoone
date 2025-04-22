package com.example.demotable.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demotable.model.User;

public interface UserResp extends JpaRepository<User,Integer> {

}
