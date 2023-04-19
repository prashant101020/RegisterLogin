package com.example.registerlogin.RegisterLogin.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.registerlogin.RegisterLogin.model.User;
import com.example.registerlogin.RegisterLogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);

}
