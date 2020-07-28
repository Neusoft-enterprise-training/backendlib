package com.neusoft.hotel.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.hotel.employee.mapper.IRecordMapper;
import com.neusoft.hotel.employee.model.RecordModel;
import com.neusoft.hotel.employee.service.IRecordService;

public class RecordServiceImpl implements IRecordService {
	
	@Autowired
	IRecordMapper recordMapper=null;

	@Override
	public void add(RecordModel recordModel) throws Exception {
		recordMapper.insert(recordModel);
	}

	@Override
	public void modify(RecordModel recordModel) throws Exception {
		recordMapper.update(recordModel);
	}

	@Override
	public void delete(RecordModel recordModel) throws Exception {
		recordMapper.delete(recordModel);
	}

	@Override
	public List<RecordModel> getByAll() throws Exception {
		return recordMapper.selectByAll();
	}

	@Override
	public List<RecordModel> getByEmployeeID(int employeeID) throws Exception {
		return recordMapper.selectByEmployeeID(employeeID);
	}
}
