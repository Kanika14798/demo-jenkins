package com.practice.jenkins.demojenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PrintController {
	
	@GetMapping("message")
	public String print() {
		return "Hello Jenkins";
	}
	
	@GetMapping("/test")
	public String testMethod() {
		return "testMethod";
	}

}
