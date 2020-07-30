package com.neusoft.hotel.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.hotel.admin.model.UserModel;

@Mapper
public interface IUserMapper {
	public void update(UserModel um) throws Exception;
	//通过ID取得管理员对象
	public UserModel getById(String id) throws Exception;

}
