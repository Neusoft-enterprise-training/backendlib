package com.neusoft.hotel.business.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Bath")
public class BathModel implements Serializable {
	
	private String id = null;
	private String name = null;
	private int charge = 0;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	

}
