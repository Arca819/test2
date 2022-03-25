package com.dmm.test1.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmm.test1.data.entity.Users;

public interface UserRepository extends JpaRepository<Users, String> {

}