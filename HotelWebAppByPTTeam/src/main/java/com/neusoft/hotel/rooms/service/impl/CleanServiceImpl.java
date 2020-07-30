package com.neusoft.hotel.rooms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.rooms.mapper.ICleanMapper;
import com.neusoft.hotel.rooms.model.CleanModel;
import com.neusoft.hotel.rooms.service.ICleanService;



@Service
@Transactional  //环绕事务Advice的切入点
public class CleanServiceImpl implements ICleanService {
	@Autowired
	private ICleanMapper roomMapper=null;
	@Override
	public int add(CleanModel dm) throws Exception {
		roomMapper.insert(dm);
		return dm.getCleanid();
	}

	@Override
	public void modify(CleanModel dm) throws Exception {
		roomMapper.update(dm);
	}

	@Override
	public void delete(CleanModel dm) throws Exception {
		roomMapper.delete(dm);
	}

	@Override
	public List<CleanModel> getListByAll() throws Exception {
		
		return roomMapper.selectByAll();
	}

	@Override
	public List<CleanModel> getListByAllWithPage(int rows, int page) throws Exception {
		
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
	public CleanModel getByNo(int no) throws Exception {
		
		return roomMapper.selectByNo(no);
	}

}
