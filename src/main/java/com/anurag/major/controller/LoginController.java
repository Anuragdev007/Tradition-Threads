package com.anurag.major.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.anurag.major.global.GlobalData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.anurag.major.model.Role;
import com.anurag.major.model.User;
import com.anurag.major.repository.RoleRepository;
import com.anurag.major.repository.UserRepository;

@Controller
public class LoginController {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	@GetMapping("/login")
	public String login() {
		GlobalData.cart.clear();
		return "login";
	}
	@GetMapping("/register")
	public String registerGet() {
		return "register";
	}
	
@PostMapping("/register")
public String registePost(@ModelAttribute("user")User user,HttpServletRequest request)throws ServletException{
	String password=user.getPassword();
	user.setPassword(bCryptPasswordEncoder.encode(password));
	List<Role> roles=new ArrayList<>();
	roles.add(roleRepository.findById(2).get());
	user.setRoles(roles);
	userRepository.save(user);
	request.login(user.getEmail(), password);
	return "redirect:/";
}
}
