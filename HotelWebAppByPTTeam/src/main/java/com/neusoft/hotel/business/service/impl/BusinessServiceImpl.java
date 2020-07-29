package com.neusoft.hotel.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.business.mapper.IBusinessMapper;
import com.neusoft.hotel.business.model.BusinessModel;
import com.neusoft.hotel.business.service.IBusinessService;


@Service
@Transactional  //环绕事务Advice的切入点
public class BusinessServiceImpl implements IBusinessService {
	@Autowired
	private IBusinessMapper businessMapper=null;
	@Override
	public int add(BusinessModel dm) throws Exception {
		businessMapper.insert(dm);
		return dm.getNo();
	}

	@Override
	public void modify(BusinessModel dm) throws Exception {
		businessMapper.update(dm);
	}

	@Override
	public void delete(BusinessModel dm) throws Exception {
		businessMapper.delete(dm);
	}

	@Override
	public List<BusinessModel> getListByAll() throws Exception {
		
		return businessMapper.selectByAll();
	}

	@Override
	public List<BusinessModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return businessMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		
		return businessMapper.selectCountByAll();
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
	public BusinessModel getByNo(int no) throws Exception {
		
		return businessMapper.selectByNo(no);
	}

}
