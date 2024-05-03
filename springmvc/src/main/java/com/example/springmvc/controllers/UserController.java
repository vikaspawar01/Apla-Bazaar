package com.example.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springmvc.models.User;
import com.example.springmvc.services.UserService;
@Controller
public class UserController {
	
	String name="vikas";
	@Autowired
	UserService service;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/add")
	public String firstmethod(Model model){
		model.addAttribute("obj",new User());
		return "register";
	}
	
	@PostMapping("/add")
	public String addUser(@ModelAttribute User user) {
		this.service.create(user);
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String secondmethod(Model model){
		model.addAttribute("users",this.service.getAll());
		return "list";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		this.service.delete(id);
		return "redirect:/list";
	}
	
	@GetMapping("/edit/{id}")
	public String editUser(@PathVariable Integer id, Model model) {
	    model.addAttribute("obj",this.service.getById(id));
	    return "register";
	}
	
	@PostMapping("edit/{id}")
	public String editUser2(@PathVariable Integer id,@ModelAttribute User user) {
		this.service.update(id, user);
		return "redirect:/list";
	}
}
