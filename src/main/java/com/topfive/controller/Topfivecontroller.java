package com.topfive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topfive.service.TopfiveService;

@RestController
public class Topfivecontroller {
@Autowired
	TopfiveService service;
	
	@GetMapping("/topfive")
	public List<String> sayhello() {

		
		return service.JsonParser();
	}
	
}
