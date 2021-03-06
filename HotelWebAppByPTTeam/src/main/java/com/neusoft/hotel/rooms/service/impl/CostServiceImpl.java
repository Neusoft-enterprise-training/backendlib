package com.neusoft.hotel.rooms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.rooms.mapper.ICostMapper;
import com.neusoft.hotel.rooms.model.CostModel;
import com.neusoft.hotel.rooms.service.ICostService;


@Service
@Transactional  //环绕事务Advice的切入点
public class CostServiceImpl implements ICostService {
	@Autowired
	private ICostMapper roomMapper=null;
	@Override
	public int add(CostModel dm) throws Exception {
		roomMapper.insert(dm);
		return dm.getNo();
	}

	@Override
	public void modify(CostModel dm) throws Exception {
		roomMapper.update(dm);
	}

	@Override
	public void delete(CostModel dm) throws Exception {
		roomMapper.delete(dm);
	}

	@Override
	public List<CostModel> getListByAll() throws Exception {
		
		return roomMapper.selectByAll();
	}

	@Override
	public List<CostModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return roomMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		
		return roomMapper.selectCountByAll();
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
	public CostModel getByNo(int no) throws Exception {
		
		return roomMapper.selectByNo(no);
	}

}
