package com.neusoft.hotel.business.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Response")
public class ResponseModel implements Serializable {
	
	private String bcode = null;
	private String wid = null;
	private String time = null;
	
	public String getBcode() {
		return bcode;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
	}
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
