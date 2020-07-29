package com.neusoft.hotel.customer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.customer.model.CommentModel;

@Mapper
public interface ICommentMapper {
	public void insert(CommentModel m) throws Exception;
	
	public void update(CommentModel m) throws Exception;
	
	public void delete(CommentModel m) throws Exception;
	
	//取得所有的评论
	public List<CommentModel> selectByAll() throws Exception;
	
	//取得所有评论列表，分页模式，参数：start：起始位置：rows：取得记录格式。
	public List<CommentModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	
	//取得评论个数
	public int selectCountByAll() throws Exception;
	
	//按ID找评论
	public CommentModel selectById(int id) throws Exception;
	
}
