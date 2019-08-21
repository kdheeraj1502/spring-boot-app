package com.broadband.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.broadband.model.UserDetailsMO;
import com.broadband.service.BroadBandService;

@RestController
@RequestMapping("/user")
public class BroadBandController {
	
	@Autowired
	BroadBandService broadBandService;
	
	@RequestMapping("/newconnection")
	public String requestNewConnection() {
		UserDetailsMO userDetailsMO=new UserDetailsMO();
		userDetailsMO.setEmailId("hello@gmail.com");
		userDetailsMO.setMobileNumber(808997588l);
		userDetailsMO.setUserName("Dheeraj");
		return broadBandService.requestNewConnection(userDetailsMO);
	}
}
