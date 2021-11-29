package com.govind.springappdevelopment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
//	curl -X GET "http://localhost:8080/hello/query/?fName=Govind&lName=kumar" -w "\n"
	@RequestMapping(value= {"/query"},method=RequestMethod.GET)
	public String sayHello(@RequestParam(value="fName") String fName,@RequestParam(value="lName") String lName){
		return "Hello "+fName+" "+lName+" !";
	}
//	curl -X GET "http://localhost:8080/hello/param/Govind" -w "\n"
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello "+name+" !";
	}
}
