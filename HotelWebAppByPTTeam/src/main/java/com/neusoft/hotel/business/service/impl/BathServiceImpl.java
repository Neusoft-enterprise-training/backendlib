package com.neusoft.hotel.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.business.mapper.IBathMapper;
import com.neusoft.hotel.business.model.BathModel;
import com.neusoft.hotel.business.service.IBathService;


@Service
@Transactional  //环绕事务Advice的切入点
public class BathServiceImpl implements IBathService {

	@Autowired
	private IBathMapper bathMapper=null;
	
	@Override
	public String add(BathModel dm) throws Exception {
		bathMapper.insert(dm);
		return dm.getId();
	}

	@Override
	public void modify(BathModel dm) throws Exception {
		bathMapper.update(dm);
	}

	@Override
	public void delete(BathModel dm) throws Exception {
		bathMapper.delete(dm);
	}

	@Override
	public List<BathModel> getListByAll() throws Exception {
		
		return bathMapper.selectByAll();
	}

	@Override
	public List<BathModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return bathMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		
		return bathMapper.selectCountByAll();
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
	public BathModel getByNo(int no) throws Exception {
		
		return bathMapper.selectById(no);
	}

}
