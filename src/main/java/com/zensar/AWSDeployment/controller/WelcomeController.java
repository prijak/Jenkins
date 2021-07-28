package com.zensar.AWSDeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("hello")
	public String sayHello(){
		System.out.println("Hello world");
		return"Hello Welcome to AWS Training";
	}
	
	@GetMapping("hi")
	public String sayHi(){
		return"Hi Welcome to AWS Training";
	}

}
