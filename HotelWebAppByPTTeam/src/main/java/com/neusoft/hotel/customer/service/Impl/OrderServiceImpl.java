package com.neusoft.hotel.customer.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.hotel.customer.mapper.IOrderMapper;
import com.neusoft.hotel.customer.model.OrderModel;
import com.neusoft.hotel.customer.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private IOrderMapper orderMapper=null;
	
	@Override
	public int add(OrderModel om) throws Exception {
		orderMapper.insert(om);
		return om.getId();
	}

	@Override
	public void modify(OrderModel om) throws Exception {
		orderMapper.update(om);
	}

	@Override
	public void delete(OrderModel om) throws Exception {
		orderMapper.delete(om);
	}

	@Override
	public List<OrderModel> getListByAll() throws Exception {
		return orderMapper.selectByAll();
	}

	@Override
	public List<OrderModel> getListByAllWithPage(int rows, int page) throws Exception {
		return orderMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		return orderMapper.selectCountByAll();
	}

	@Override
	public int getPageCountByAll(int rows) throws Exception {
		int count=this.getCountByAll();
		int pageCount=0;
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		
		return pageCount;
	}

	@Override
	public OrderModel getById(int id) throws Exception {
		return orderMapper.selectById(id);
	}

}
