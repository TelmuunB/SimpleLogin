package com.springBootLogin.codingTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springBootLogin.entity.User;

@Controller
public class UserRegisterController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/register")
	public String registerForm(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping(path="/register")
	public String addNewUser(@ModelAttribute User user, Model model) {
		userRepository.save(user);
		return "register";
	}
}
