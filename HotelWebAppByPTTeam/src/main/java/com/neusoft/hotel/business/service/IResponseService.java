package com.neusoft.hotel.business.service;

import java.util.List;

import com.neusoft.hotel.business.model.ResponseModel;

public interface IResponseService {
	//增加部门
	public String add(ResponseModel dm) throws Exception;
	//修改部门
	public void modify(ResponseModel dm) throws Exception;
	//删除部门
	public void delete(ResponseModel dm) throws Exception;
	//取得所有部门列表
	public List<ResponseModel> getListByAll() throws Exception;
	//取得所有部门列表,分页模式
	public List<ResponseModel> getListByAllWithPage(int rows, int page) throws Exception;
	//取得部门的个数
	public int getCountByAll() throws Exception;
	//取得部门的显示页数
	public int getPageCountByAll(int rows) throws Exception;
	
	//根据部门的id（PK）取得指定的部门对象
	public ResponseModel getByNo(String bcode) throws Exception;

}
