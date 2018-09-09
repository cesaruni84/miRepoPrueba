package com.database.springbootmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.springbootmysql.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
