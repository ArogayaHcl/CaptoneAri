package com.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}

