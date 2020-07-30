package com.neusoft.hotel.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.business.mapper.IResponseMapper;
import com.neusoft.hotel.business.model.ResponseModel;
import com.neusoft.hotel.business.service.IResponseService;

@Service
@Transactional  //环绕事务Advice的切入点
public class ResponseServiceImpl implements IResponseService {

	@Autowired
	private IResponseMapper responseMapper=null;
	
	@Override
	public String add(ResponseModel dm) throws Exception {
		responseMapper.insert(dm);
		return dm.getBcode() + " " + dm.getWid();
	}

	@Override
	public void modify(ResponseModel dm) throws Exception {
		responseMapper.update(dm);
	}

	@Override
	public void delete(ResponseModel dm) throws Exception {
		responseMapper.delete(dm);
	}

	@Override
	public List<ResponseModel> getListByAll() throws Exception {
		
		return responseMapper.selectByAll();
	}

	@Override
	public List<ResponseModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return responseMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		
		return responseMapper.selectCountByAll();
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
	public ResponseModel getByNo(int rid) throws Exception {
		
		return responseMapper.selectById(rid);
	}

}
