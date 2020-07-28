package com.neusoft.hotel.employee.service;

import java.util.List;

import com.neusoft.hotel.employee.model.EmployeeModel;
import com.neusoft.hotel.employee.model.GroupModel;

public interface IGroupService {
	
	public int add(GroupModel groupModel) throws Exception;

	public void modify(GroupModel groupModel) throws Exception;

	public void delete(GroupModel groupModel) throws Exception;

	public List<GroupModel> getByAll() throws Exception;

	public GroupModel getByGroupID(int groupID) throws Exception;
}
