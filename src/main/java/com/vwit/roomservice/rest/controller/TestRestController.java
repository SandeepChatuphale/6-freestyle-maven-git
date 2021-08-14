package com.vwit.roomservice.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController{

	@GetMapping("/")
	public String hi()
	{
		System.out.println("OKkokokokokoko");
		return "Hello";
	}
}
