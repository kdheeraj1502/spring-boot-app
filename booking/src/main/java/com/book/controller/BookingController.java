package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.service.BookingService;

@RestController
@RequestMapping("/")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@RequestMapping("/user/booking")
	public String requestBooking() {
		return bookingService.requestBooking();
	}
}
