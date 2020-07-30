package com.neusoft.hotel.business.service;

import java.util.List;

import com.neusoft.hotel.business.model.BathModel;

public interface IBathService {

	//增加部门
	public int add(BathModel dm) throws Exception;
	//修改部门
	public void modify(BathModel dm) throws Exception;
	//删除部门
	public void delete(BathModel dm) throws Exception;
	//取得所有部门列表
	public List<BathModel> getListByAll() throws Exception;
	//取得所有部门列表,分页模式
	public List<BathModel> getListByAllWithPage(int rows, int page) throws Exception;
	//取得部门的个数
	public int getCountByAll() throws Exception;
	//取得部门的显示页数
	public int getPageCountByAll(int rows) throws Exception;
	
	//根据部门的id（PK）取得指定的部门对象
	public BathModel getByNo(int id) throws Exception;
	
}
