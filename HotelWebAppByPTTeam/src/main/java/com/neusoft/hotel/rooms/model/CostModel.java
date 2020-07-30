package com.neusoft.hotel.rooms.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Cost")
public class CostModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2449592182142164857L;
	
	private int no = 0;
	private String soupcost = null;
	private String foodcost = null;
	private String condomcost = null;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSoupcost() {
		return soupcost;
	}
	public void setSoupcost(String soupcost) {
		this.soupcost = soupcost;
	}
	public String getFoodcost() {
		return foodcost;
	}
	public void setFoodcost(String foodcost) {
		this.foodcost = foodcost;
	}
	public String getCondomcost() {
		return condomcost;
	}
	public void setCondomcost(String condomcost) {
		this.condomcost = condomcost;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
