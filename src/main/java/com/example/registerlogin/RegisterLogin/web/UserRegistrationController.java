package com.example.registerlogin.RegisterLogin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.registerlogin.RegisterLogin.Service.UserService;
import com.example.registerlogin.RegisterLogin.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user")  UserRegistrationDto registrationdto) {
		userService.save(registrationdto);
		return "redirect:/registration?success";
	}
	
	@GetMapping	
	public String showRegistrationForm() {
		return "registration";
	}
}
