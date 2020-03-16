package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.DemoService;


@RestController
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	@GetMapping("/greeting")
	public void greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		demoService.getEmployees();
	}
	
}
