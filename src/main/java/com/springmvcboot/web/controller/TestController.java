package com.springmvcboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody

public class TestController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home page");
		return "home";
	}

	@RequestMapping("/contact")
	public String contact() {
		System.out.println("This is contact");
		return "contact";
	}
}
