package com.cdci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	  /**
     * Returns a sample success message.
     * 
     * @return a string message indicating the application is working
     */
	@GetMapping("/message")
	public String getMessage() {
		return "Its working";
	}
}
