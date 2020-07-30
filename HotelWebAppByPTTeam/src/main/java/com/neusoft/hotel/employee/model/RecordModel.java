package com.neusoft.hotel.employee.model;

import java.time.Instant;

public class RecordModel {

	private int employeeID = 0;
	private String type = null;
	private Instant time = null;

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Instant getStart() {
		return time;
	}

	public void setStart(Instant time) {
		this.time = time;
	}
}
