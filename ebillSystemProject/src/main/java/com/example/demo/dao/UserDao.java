package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;
@Repository
public interface UserDao extends JpaRepository<User, Integer>
{

	User findByUsername(String user_name);

}
