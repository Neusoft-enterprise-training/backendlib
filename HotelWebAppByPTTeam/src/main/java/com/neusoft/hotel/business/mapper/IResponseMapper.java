package com.neusoft.hotel.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.business.model.BathModel;
import com.neusoft.hotel.business.model.ResponseModel;

@Mapper
public interface IResponseMapper {
	
	public void insert(ResponseModel m) throws Exception;
	
	public void update(ResponseModel m) throws Exception;
	
	public void delete(ResponseModel m) throws Exception;
	
	//取得所有的负责关系
	public List<ResponseModel> selectByAll() throws Exception;
	
	//取得所有负责关系列表，分页模式，参数：start：起始位置：rows：取得记录格式。
	public List<ResponseModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	
	//取得负责关系个数
	public int selectCountByAll() throws Exception;
	
	//按业务ID找负责关系
	public ResponseModel selectById(int rid) throws Exception;

}
