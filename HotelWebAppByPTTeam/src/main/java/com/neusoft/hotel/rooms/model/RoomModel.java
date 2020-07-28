package com.neusoft.hotel.rooms.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Room")
public class RoomModel implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2449592182142164857L;
	
	private int no = 0;
	private String type = null;
	private String state = null;
	private String worker = null;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getWorker() {
		return worker;
	}
	public void setWorker(String worker) {
		this.worker = worker;
	}
}