package com.example.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.StaffDto;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class StaffController {
	
	@PostMapping(path = "/registration")
	public String registrationUser(@RequestBody StaffDto staffDto) {
		return null;
		
	}
}
