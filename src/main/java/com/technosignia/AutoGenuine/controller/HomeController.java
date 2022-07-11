package com.technosignia.AutoGenuine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello user, have a nice day";
	}
	

}
