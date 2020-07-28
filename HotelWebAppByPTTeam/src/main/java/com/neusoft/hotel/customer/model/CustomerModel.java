package com.neusoft.hotel.customer.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;


@Alias("Customer")
public class CustomerModel {
	
	private int id = 0;
	
	private String name = null;
	private String sex = null;
	private String age = null;
	private int level = 0;
	
	private Date start = null;
	private Date end = null;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date startTime) {
		this.start = startTime;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date endTime) {
		this.end = endTime;
	}

}
