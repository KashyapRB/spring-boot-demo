package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/printDemo")
public class demoController {

	@RequestMapping(value = "/hello")
	public String testControl() {
		return "Hello There ! This is test connect 001";
	}

}
