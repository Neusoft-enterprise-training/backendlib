package com.neusoft.hotel.employee.service;

import java.util.List;

import com.neusoft.hotel.employee.model.EmployeeModel;

public interface IEmployeeService {
	
	public int add(EmployeeModel employeeModel) throws Exception;

	public void modify(EmployeeModel employeeModel) throws Exception;

	public void delete(EmployeeModel employeeModel) throws Exception;

	public List<EmployeeModel> getByAll() throws Exception;

	public EmployeeModel getByEmployeeID(int employeeID) throws Exception;
}
