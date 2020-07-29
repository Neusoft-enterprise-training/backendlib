package com.neusoft.hotel.customer.service;

import java.util.List;

import com.neusoft.hotel.customer.model.OrderModel;


public interface IOrderService {

	        //增加订单
			public int add(OrderModel om) throws Exception;
			//修改订单
			public void modify(OrderModel om) throws Exception;
			//删除订单
			public void delete(OrderModel om) throws Exception;
			//取得所有订单列表
			public List<OrderModel> getListByAll() throws Exception;
			//取得所有订单列表,分页模式
			public List<OrderModel> getListByAllWithPage(int rows, int page) throws Exception;
			//取得订单的个数
			public int getCountByAll() throws Exception;
			//取得订单的显示页数
			public int getPageCountByAll(int rows) throws Exception;
			
			//根据订单的id取得指定的订单对象
			public OrderModel getById(int id) throws Exception;
}
