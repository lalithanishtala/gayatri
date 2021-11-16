package com.example.Durga.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

	
	@GetMapping("/test")
	public String testMethod() {
		return " hello Durgi";
	}

}