package com.neusoft.hotel.rooms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.rooms.model.RoomModel;

//房间的Mapper接口（DAO接口）
@Mapper
public interface IRoomMapper {
public void insert(RoomModel m) throws Exception;
	
	public void update(RoomModel m) throws Exception;
	
	public void delete(RoomModel m) throws Exception;
	
	//取得所有的房间
	public List<RoomModel> selectByAll() throws Exception;
	
	//取得所有房间列表，分页模式，参数：start：起始位置：rows：取得记录格式。
	public List<RoomModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	
	//取得房间个数
	public int selectCountByAll() throws Exception;
	//按编号找房间
	public RoomModel selectByNo(int no) throws Exception;
	
	//取得指定房间的信息
	public RoomModel selectByNOWithEmployees(int no) throws Exception;
}
