package com.neusoft.hotel.customer.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("Comment")
public class CommentModel {

	private int id = 0;
	private int cid = 0;
	private Date time = null;
	private char level = 'a';
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public char getLevel() {
		return level;
	}
	public void setLevel(char level) {
		this.level = level;
	}
	
}
