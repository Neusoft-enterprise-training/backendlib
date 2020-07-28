package com.neusoft.hotel.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.hotel.employee.mapper.IGroupMapper;
import com.neusoft.hotel.employee.model.GroupModel;
import com.neusoft.hotel.employee.service.IGroupService;

public class GroupServiceImpl implements IGroupService {

	@Autowired
	IGroupMapper groupMapper = null;

	@Override
	public int add(GroupModel groupModel) throws Exception {
		groupMapper.insert(groupModel);
		return groupModel.getGroupID();
	}

	@Override
	public void modify(GroupModel groupModel) throws Exception {
		groupMapper.update(groupModel);
	}

	@Override
	public void delete(GroupModel groupModel) throws Exception {
		groupMapper.delete(groupModel);
	}

	@Override
	public List<GroupModel> getByAll() throws Exception {
		return groupMapper.selectByAll();
	}

	@Override
	public GroupModel getByGroupID(int groupID) throws Exception {
		return groupMapper.selectByGroupID(groupID);
	}
}
