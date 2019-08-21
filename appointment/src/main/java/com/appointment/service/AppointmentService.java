package com.appointment.service;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.appointment.model.AppointmentMO;

@Service
public class AppointmentService {
	
	public String requestAppointment() {
		AppointmentMO appointmentMO=new AppointmentMO();
		appointmentMO.setAppointmentDate(Calendar.YEAR);
		appointmentMO.setServiceName("broadband service");
		appointmentMO.setUsedId(1245690);
		return "click for payment http://localhost:8085/user/payment";
	}
}
