package com.neusoft.hotel.customer.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.hotel.customer.mapper.ICommentMapper;
import com.neusoft.hotel.customer.model.CommentModel;
import com.neusoft.hotel.customer.service.ICommentService;

@Service
public class CommentServiceImpl implements ICommentService {

	@Autowired
	private ICommentMapper commentMapper = null;
	
	@Override
	public int add(CommentModel cm) throws Exception {
		commentMapper.insert(cm);
		return cm.getId();
	}

	@Override
	public void modify(CommentModel cm) throws Exception {
		commentMapper.update(cm);
	}

	@Override
	public void delete(CommentModel cm) throws Exception {
		commentMapper.delete(cm);
	}

	@Override
	public List<CommentModel> getListByAll() throws Exception {
		return commentMapper.selectByAll();
	}

	@Override
	public List<CommentModel> getListByAllWithPage(int rows, int page) throws Exception {
		return commentMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		return commentMapper.selectCountByAll();
	}

	@Override
	public int getPageCountByAll(int rows) throws Exception {
		int count=this.getCountByAll();
		int pageCount=0;
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		
		return pageCount;
	}

	@Override
	public CommentModel getById(int id) throws Exception {
		return commentMapper.selectById(id);
	}

}
