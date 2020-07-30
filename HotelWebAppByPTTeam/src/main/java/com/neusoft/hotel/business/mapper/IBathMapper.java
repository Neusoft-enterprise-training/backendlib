package com.neusoft.hotel.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.business.model.BathModel;

@Mapper
public interface IBathMapper {

	public void insert(BathModel m) throws Exception;
	
	public void update(BathModel m) throws Exception;
	
	public void delete(BathModel m) throws Exception;
	
	//取得所有的服务项目
	public List<BathModel> selectByAll() throws Exception;
	
	//取得所有服务项目列表，分页模式，参数：start：起始位置：rows：取得记录格式。
	public List<BathModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	
	//取得服务项目个数
	public int selectCountByAll() throws Exception;
	
	//按ID找服务项目
	public BathModel selectById(int id) throws Exception;
	
}
