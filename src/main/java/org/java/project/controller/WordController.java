package org.java.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WordController {
	
	@GetMapping("/")
	public String getHome() {
		return "home";
	}

}
