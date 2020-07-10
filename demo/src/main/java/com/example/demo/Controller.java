package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo3")
public class Controller {

	@RequestMapping(method = RequestMethod.GET, value = "/value")
	public String getValue() {
		return "Hello There !! this is content 3";
	}

}
