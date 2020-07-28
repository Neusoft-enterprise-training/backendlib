package com.neusoft.hotel.employee.service;

import java.util.List;

import com.neusoft.hotel.employee.model.RecordModel;

public interface IRecordService {

	public void add(RecordModel recordModel) throws Exception;

	public void modify(RecordModel recordModel) throws Exception;

	public void delete(RecordModel recordModel) throws Exception;

	public List<RecordModel> getByAll() throws Exception;

	public List<RecordModel> getByEmployeeID(int employeeID) throws Exception;
}
