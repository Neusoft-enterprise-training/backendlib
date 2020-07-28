package com.neusoft.hotel.employee.mapper;

import java.util.List;

import com.neusoft.hotel.employee.model.RecordModel;

public interface IRecordMapper {

	public void insert(RecordModel recordModel) throws Exception;

	public void update(RecordModel recordModel) throws Exception;

	public void delete(RecordModel recordModel) throws Exception;

	public List<RecordModel> selectByEmployeeID(int employeeID) throws Exception;

	public List<RecordModel> selectByAll() throws Exception;

}
