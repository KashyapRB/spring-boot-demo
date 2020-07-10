package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo2")
public class DemoController {

	@GetMapping("/value")
	public String getMessage() {
		return "Hello There !! This is content 2";
	}
}
