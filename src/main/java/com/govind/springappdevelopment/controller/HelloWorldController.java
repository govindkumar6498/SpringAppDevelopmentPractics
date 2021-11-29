package com.govind.springappdevelopment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
//	curl localhost:8080/hello -w "\n"
	@RequestMapping(value= {"","/","/home"})
	public String syHello() {
		return "Hello Perfios Software Solution";
	}
}
