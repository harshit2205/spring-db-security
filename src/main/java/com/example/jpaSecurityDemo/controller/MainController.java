package com.example.jpaSecurityDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main")
public class MainController {
	
	@GetMapping
	public String greetings() {
		return "Hello World";
	}

	@GetMapping("/admin")
	public String returnAdminMylord() {
		return "this is admin central";
	}
	
	@GetMapping("/user")
	public String returnUsermyLord() {
		return "this is user central broh";
	}
	
}
