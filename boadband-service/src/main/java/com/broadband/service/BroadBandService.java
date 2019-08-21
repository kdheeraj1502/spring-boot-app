package com.broadband.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.broadband.model.UserDetailsMO;

@Service
public class BroadBandService {
	public String requestNewConnection(UserDetailsMO userDetailsMO) {
		RestTemplate restTemplate=new RestTemplate();
		String url="http://localhost:8083/user/booking";
		return restTemplate.getForObject(url, String.class);
	}
}

