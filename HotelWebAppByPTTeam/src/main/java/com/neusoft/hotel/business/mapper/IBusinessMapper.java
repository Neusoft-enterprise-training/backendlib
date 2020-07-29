package com.neusoft.hotel.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.business.model.BusinessModel;


//业务的Mapper接口
@Mapper
public interface IBusinessMapper {
	//增加业务
	public void insert(BusinessModel bm) throws Exception;
	//修改业务
	public void update(BusinessModel bm) throws Exception;
	//删除业务
	public void delete(BusinessModel bm) throws Exception;
	//取得所有业务列表
	public List<BusinessModel> selectByAll() throws Exception;
	//取得所有业务列表，分页模式 参数： start：起始位置； rows:取得记录格式， 
	public List<BusinessModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得业务的个数
	public int selectCountByAll() throws Exception;
	//根据业务的no（PK）取得指定的部门对象
	public BusinessModel selectByNo(int no) throws Exception;
	//取得指定的业务，并取得其关联的员工集合
	public BusinessModel selectByNoWithEmployees(int no) throws Exception;
		
}
