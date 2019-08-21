package com.appointment.model;

import java.util.Date;

public class AppointmentMO {
	private int usedId;
	private String serviceName;
	private int appointmentDate;
	
	public int getUsedId() {
		return usedId;
	}
	public void setUsedId(int usedId) {
		this.usedId = usedId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public int getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(int year) {
		this.appointmentDate = year;
	}
	
	
}
