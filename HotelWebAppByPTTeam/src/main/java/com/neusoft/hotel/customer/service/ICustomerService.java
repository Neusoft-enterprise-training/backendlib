package com.neusoft.hotel.customer.service;

import java.util.List;

import com.neusoft.hotel.customer.model.CustomerModel;


public interface ICustomerService {

	//增加顾客
		public int add(CustomerModel cm) throws Exception;
		//修改顾客
		public void modify(CustomerModel cm) throws Exception;
		//删除顾客
		public void delete(CustomerModel cm) throws Exception;
		//取得所有顾客列表
		public List<CustomerModel> getListByAll() throws Exception;
		//取得所有顾客列表,分页模式
		public List<CustomerModel> getListByAllWithPage(int rows, int page) throws Exception;
		//取得顾客的个数
		public int getCountByAll() throws Exception;
		//取得顾客的显示页数
		public int getPageCountByAll(int rows) throws Exception;
		
		//根据顾客的id取得指定的顾客对象
		public CustomerModel getByNo(int id) throws Exception;
}
