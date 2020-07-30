package com.neusoft.hotel.rooms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.Result.Result;
import com.neusoft.hotel.rooms.model.CostModel;
import com.neusoft.hotel.rooms.service.ICostService;

@RestController
@RequestMapping("/Cost")
@CrossOrigin(origins = {"*", "null"})
public class CostController {
	@Autowired
	private ICostService ds=null;
	
	@PostMapping(value="/add")
	public Result<String> add(CostModel dm) throws Exception {
		System.out.println(dm.getNo());
		ds.add(dm);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("增加成功");
		return result;
	}
	
	@PostMapping(value="/modify")
	public Result<String> modify(CostModel dm) throws Exception {
		ds.modify(dm);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("修改成功");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(CostModel dm) throws Exception {
		ds.delete(dm);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("删除成功");
		return result;
	}
	
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<CostModel> getListByAllWithPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1")int page) throws Exception {
		Result<CostModel> result = new Result<CostModel>();
		result.setPageCount(ds.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(ds.getListByAllWithPage(rows, page));
		result.setCount(ds.getCountByAll());
		
		
		result.setStatus("Fine");
		result.setMessage("取得部门列表分页成功");
		return result;
	}
	
	
	@GetMapping(value="/get")
	public Result<CostModel> getByNo(@RequestParam(required=true)int no) throws Exception {
		Result<CostModel> result = new Result<CostModel>();
		result.setResult(ds.getByNo(no));
		
		
		result.setStatus("Fine");
		result.setMessage("取得指定部门对象成功");
		return result;
	}
}
