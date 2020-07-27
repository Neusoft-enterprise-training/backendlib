package com.neusoft.hotel.customer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.customer.model.CustomerModel;

public interface ICustomerMapper {
public void update(CustomerModel m) throws Exception;
	
	public void delete(CustomerModel m) throws Exception;
	
	//取得所有的部门
	public List<CustomerModel> selectByAll() throws Exception;
	
	//取得所有部门列表，分页模式，参数：start：起始位置：rows：取得记录格式。
	public List<CustomerModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	
	//取得部门个数
	public int selectCountByAll() throws Exception;
	//按编号找部门
	public CustomerModel selectByNo(int no) throws Exception;
	
	//取得指定部门的员工集合
	public CustomerModel selectByNOWithEmployees(int no) throws Exception;
}
