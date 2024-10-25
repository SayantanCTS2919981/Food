package com.cts.fooddelivery.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/api")
	public ResponseEntity<String> test(){
		return new ResponseEntity<>("Hello",HttpStatus.OK);
	}
}
