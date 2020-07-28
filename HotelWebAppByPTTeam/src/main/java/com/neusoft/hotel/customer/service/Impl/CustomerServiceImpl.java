package com.neusoft.hotel.customer.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.hotel.customer.mapper.ICustomerMapper;
import com.neusoft.hotel.customer.model.CustomerModel;
import com.neusoft.hotel.customer.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerMapper customerMapper=null;
	
	@Override
	public int add(CustomerModel cm) throws Exception {
		customerMapper.insert(cm);
		return cm.getId();
	}

	@Override
	public void modify(CustomerModel cm) throws Exception {
		customerMapper.update(cm);
	}

	@Override
	public void delete(CustomerModel cm) throws Exception {
		customerMapper.delete(cm);
	}

	@Override
	public List<CustomerModel> getListByAll() throws Exception {
		
		return customerMapper.selectByAll();
	}

	@Override
	public List<CustomerModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return customerMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		
		return customerMapper.selectCountByAll();
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
	public CustomerModel getByNo(int no) throws Exception {
		
		return customerMapper.selectByNo(no);
	}

}
