package com.payment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PaymentController {

	@RequestMapping("/user/payment")
	public String requestBill() {
		return "payment successful";
	}
}
