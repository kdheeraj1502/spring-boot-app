package com.appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.model.AppointmentMO;
import com.appointment.service.AppointmentService;

@RestController
@RequestMapping("/")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@RequestMapping("/user/appointment")
	public String requestAppointment() {
		return appointmentService.requestAppointment();
	}

}
