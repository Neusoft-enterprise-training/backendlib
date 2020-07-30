package com.neusoft.hotel.rooms.service;

import java.util.List;

import com.neusoft.hotel.rooms.model.CostModel;

public interface ICostService {
	
	//增加部门
	public int add(CostModel dm) throws Exception;
	//修改部门
	public void modify(CostModel dm) throws Exception;
	//删除部门
	public void delete(CostModel dm) throws Exception;
	//取得所有部门列表
	public List<CostModel> getListByAll() throws Exception;
	//取得所有部门列表,分页模式
	public List<CostModel> getListByAllWithPage(int rows, int page) throws Exception;
	//取得部门的个数
	public int getCountByAll() throws Exception;
	//取得部门的显示页数
	public int getPageCountByAll(int rows) throws Exception;
	
	//根据部门的no（PK）取得指定的部门对象
	public CostModel getByNo(int no) throws Exception;
	
		
}
