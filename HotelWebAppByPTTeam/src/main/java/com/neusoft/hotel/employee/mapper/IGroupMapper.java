package com.neusoft.hotel.employee.mapper;

import java.util.List;

import com.neusoft.hotel.employee.model.GroupModel;

// 组Mapper
public interface IGroupMapper {
	public void insert(GroupModel groupModel) throws Exception;

	public void update(GroupModel groupModel) throws Exception;

	public void delete(GroupModel groupModel) throws Exception;

	public GroupModel selectByGroupID(int groupID) throws Exception;

	public List<GroupModel> selectByAll() throws Exception;
}
