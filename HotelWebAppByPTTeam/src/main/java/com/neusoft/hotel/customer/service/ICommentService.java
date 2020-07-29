package com.neusoft.hotel.customer.service;

import java.util.List;

import com.neusoft.hotel.customer.model.CommentModel;

public interface ICommentService {
	
    //增加评论
	public int add(CommentModel om) throws Exception;
	//修改评论
	public void modify(CommentModel om) throws Exception;
	//删除评论
	public void delete(CommentModel om) throws Exception;
	//取得所有评论列表
	public List<CommentModel> getListByAll() throws Exception;
	//取得所有评论列表,分页模式
	public List<CommentModel> getListByAllWithPage(int rows, int page) throws Exception;
	//取得评论的个数
	public int getCountByAll() throws Exception;
	//取得评论的显示页数
	public int getPageCountByAll(int rows) throws Exception;
	
	//根据评论的id取得指定的订单对象
	public CommentModel getById(int id) throws Exception;

}
