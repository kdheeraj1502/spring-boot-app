package com.book.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookingService {
	public String requestBooking() {
		RestTemplate restTemplate=new RestTemplate();
		String url="http://localhost:8080/user/appointment";
		return restTemplate.getForObject( url, String.class);
	}
}
