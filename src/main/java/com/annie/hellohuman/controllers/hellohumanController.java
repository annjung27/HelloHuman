package com.annie.hellohuman.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class hellohumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String searchQuery,
			@RequestParam(value="last_name", required=false) String last_name) {
		if (searchQuery == null) {
			return "Hello, Human!";
		}	
		
		if (last_name == null) {
			return  "Hello, " + searchQuery;
		}
				
		return "Hello, " + searchQuery + " " + last_name;
	}
}
