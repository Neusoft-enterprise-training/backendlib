package com.neusoft.hotel.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.employee.mapper.IEmployeeMapper;
import com.neusoft.hotel.employee.model.EmployeeModel;
import com.neusoft.hotel.employee.service.IEmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeMapper employeeMapper = null;

	@Override
	public int add(EmployeeModel employeeModel) throws Exception {
		employeeMapper.insert(employeeModel);
		return employeeModel.getEmployeeID();
	}

	@Override
	public void modify(EmployeeModel employeeModel) throws Exception {
		employeeMapper.update(employeeModel);
	}

	@Override
	public void delete(EmployeeModel employeeModel) throws Exception {
		employeeMapper.delete(employeeModel);
	}

	@Override
	public List<EmployeeModel> getByAll() throws Exception {
		return employeeMapper.selectByAll();
	}

	@Override
	public EmployeeModel getByEmployeeID(int employeeID) throws Exception {
		return employeeMapper.selectByEmployeeID(employeeID);
	}
}
