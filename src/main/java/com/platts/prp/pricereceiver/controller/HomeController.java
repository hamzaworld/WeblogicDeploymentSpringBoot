package com.platts.prp.pricereceiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platts.prp.pricereceiver.service.HomeService;

@RestController
@RequestMapping("/ping")
public class HomeController {

	@Autowired
	HomeService homeService;
	
	@GetMapping
	public String getMessage() {
		return homeService.getMessage();
	}
	
}
