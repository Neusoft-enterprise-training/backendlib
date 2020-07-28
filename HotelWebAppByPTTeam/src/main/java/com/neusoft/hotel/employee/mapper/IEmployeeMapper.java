package com.neusoft.hotel.employee.mapper;

import java.util.List;

import com.neusoft.hotel.customer.model.CustomerModel;
import com.neusoft.hotel.employee.model.EmployeeModel;

// 雇员Mapper
public interface IEmployeeMapper {

	public void insert(EmployeeModel employeeModel) throws Exception;

	public void update(EmployeeModel employeeModel) throws Exception;

	public void delete(EmployeeModel employeeModel) throws Exception;

	public EmployeeModel selectByEmployeeID(int employeeID) throws Exception;

	public List<EmployeeModel> selectByAll() throws Exception;

}
