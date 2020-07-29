package com.neusoft.hotel.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.Result.Result;
import com.neusoft.hotel.customer.model.CommentModel;
import com.neusoft.hotel.customer.service.ICommentService;

@RestController
@RequestMapping("/Comment")
@CrossOrigin(origins = {"*", "null"})
public class CommentController {
	
	@Autowired
	private ICommentService cs = null;
	
	@PostMapping(value="/add")
	public Result<String> add(@RequestBody CommentModel cm) throws Exception {
		cs.add(cm);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("增加顾客成功");
		return result;
	}
	
	@PostMapping(value="/modify")
	public Result<String> modify(@RequestBody CommentModel cm) throws Exception {
		cs.modify(cm);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("修改顾客成功");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestBody CommentModel cm) throws Exception {
		cs.delete(cm);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("删除顾客成功");
		return result;
	}
	
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<CommentModel> getListByAllWithPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1")int page) throws Exception {
		Result<CommentModel> result = new Result<CommentModel>();
		result.setPageCount(cs.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(cs.getListByAllWithPage(rows, page));
		result.setCount(cs.getCountByAll());
		
		
		result.setStatus("Fine");
		result.setMessage("取得顾客列表分页成功");
		return result;
	}
	
	
	@GetMapping(value="/get")
	public Result<CommentModel> getByNo(@RequestParam(required=true)int id) throws Exception {
		Result<CommentModel> result = new Result<CommentModel>();
		result.setResult(cs.getById(id));
		result.setStatus("Fine");
		result.setMessage("取得指定顾客对象成功");
		return result;
	}
}
