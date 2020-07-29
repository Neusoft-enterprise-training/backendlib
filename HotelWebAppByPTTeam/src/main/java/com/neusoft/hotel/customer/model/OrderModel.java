package com.neusoft.hotel.customer.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("Order")
public class OrderModel {
	
	private int id = 0;
	
	private int cid = 0;
	
	private int money = 0;
	
	private Date time = null;

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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	

}
