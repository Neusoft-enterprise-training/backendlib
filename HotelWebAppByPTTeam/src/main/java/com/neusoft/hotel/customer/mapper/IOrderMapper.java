package com.neusoft.hotel.customer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.customer.model.OrderModel;

@Mapper
public interface IOrderMapper {
    public void insert(OrderModel m) throws Exception;
	
	public void update(OrderModel m) throws Exception;
	
	public void delete(OrderModel m) throws Exception;
	
	//取得所有的订单
	public List<OrderModel> selectByAll() throws Exception;
	
	//取得所有订单列表，分页模式，参数：start：起始位置：rows：取得记录格式。
	public List<OrderModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	
	//取得订单个数
	public int selectCountByAll() throws Exception;
	
	//按ID找订单
	public OrderModel selectById(int id) throws Exception;
}
