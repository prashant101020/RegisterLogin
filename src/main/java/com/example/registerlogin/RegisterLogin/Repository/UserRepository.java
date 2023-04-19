package com.example.registerlogin.RegisterLogin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registerlogin.RegisterLogin.model.User;

@Repository	
public interface UserRepository extends JpaRepository<User,Long>{
 
	User findByEmail(String email);
}
