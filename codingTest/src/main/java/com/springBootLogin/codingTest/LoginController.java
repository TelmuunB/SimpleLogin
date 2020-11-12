package com.springBootLogin.codingTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.expression.Lists;

import com.springBootLogin.entity.User;

@Controller
@RequestMapping(path="/")
public class LoginController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/login")
	public String loginForm(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping(path="/login")
	public String successfulLogin(@ModelAttribute User user, Model model) {
		
		List<User> allUsers = new ArrayList<User>();
		userRepository.findAll().forEach(allUsers::add);
		System.out.println(allUsers.size());
	    for(User userForm : allUsers) {
	    	if(userForm != null && user.getLoginid().equals(userForm.getLoginid()) && user.getPassword().equals(userForm.getPassword())) {
	    		model.addAttribute("user", user);
	    		return "result";
	    	}
	    }
	    model.addAttribute("user", user);
		return "resultError";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() { 
		return userRepository.findAll();
	}

}
