package com.neusoft.hotel.rooms.service;

import java.util.List;

import com.neusoft.hotel.rooms.model.RoomModel;

public interface IRoomService {
	
	//增加部门
	public int add(RoomModel dm) throws Exception;
	//修改部门
	public void modify(RoomModel dm) throws Exception;
	//删除部门
	public void delete(RoomModel dm) throws Exception;
	//取得所有部门列表
	public List<RoomModel> getListByAll() throws Exception;
	//取得所有部门列表,分页模式
	public List<RoomModel> getListByAllWithPage(int rows, int page) throws Exception;
	//取得部门的个数
	public int getCountByAll() throws Exception;
	//取得部门的显示页数
	public int getPageCountByAll(int rows) throws Exception;
	
	//根据部门的no（PK）取得指定的部门对象
	public RoomModel getByNo(int no) throws Exception;
	
		
}
