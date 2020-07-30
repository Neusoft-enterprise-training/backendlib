package com.neusoft.hotel.rooms.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Clean")
public class CleanModel implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2449592182142164857L;
	private int cleanid = 0;
	private String time = null;
	private String roomid = null;
	private String worker = null;
	public int getCleanid() {
		return cleanid;
	}
	public void setCleanid(int cleanid) {
		this.cleanid = cleanid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRoomid() {
		return roomid;
	}
	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}
	public String getWorker() {
		return worker;
	}
	public void setWorker(String worker) {
		this.worker = worker;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
