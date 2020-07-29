package com.neusoft.hotel.customer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.customer.model.CustomerModel;

@Mapper
public interface ICustomerMapper {
	
	public void insert(CustomerModel m) throws Exception;
	
	public void update(CustomerModel m) throws Exception;
	
	public void delete(CustomerModel m) throws Exception;
	
	//取得所有的顾客
	public List<CustomerModel> selectByAll() throws Exception;
	
	//取得所有顾客列表，分页模式，参数：start：起始位置：rows：取得记录格式。
	public List<CustomerModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	
	//取得顾客个数
	public int selectCountByAll() throws Exception;
	//按ID找顾客
	public CustomerModel selectById(int no) throws Exception;
	
	//按照订单编号取得顾客信息
	public CustomerModel selectByNOWithOrder(int no) throws Exception;
}
