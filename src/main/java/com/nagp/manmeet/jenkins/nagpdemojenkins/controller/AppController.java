package com.nagp.manmeet.jenkins.nagpdemojenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class AppController {

	@GetMapping("/greet")
	public String greet() {
		return "Hello from Server";
	}

}
