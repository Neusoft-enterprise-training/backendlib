package com.neusoft.hotel.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.business.model.BusinessModel;
import com.neusoft.hotel.business.service.IBusinessService;
import com.neusoft.hotel.Result.Result;

@RestController
@RequestMapping(value="/business")
public class BusinessController {
	
	@Autowired
	private IBusinessService bs=null;
		
	@PostMapping(value="/add")
	public Result<String> add(BusinessModel dm) throws Exception{
		bs.add(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加部门成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(BusinessModel dm) throws Exception{
		bs.modify(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改部门成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(BusinessModel dm) throws Exception{
		bs.delete(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除部门成功!");
		return result;
	}
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<BusinessModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
		Result<BusinessModel> result=new Result<BusinessModel>();
		result.setCount(bs.getCountByAll());
		result.setPageCount(bs.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(bs.getListByAllWithPage(rows, page));
		
		result.setStatus("OK");
		result.setMessage("取得部门列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<BusinessModel> getByNo(@RequestParam(required=true) int no) throws Exception{
		Result<BusinessModel> result=new Result<BusinessModel>();
		result.setResult(bs.getByNo(no));
		
		result.setStatus("OK");
		result.setMessage("取得指定部门对象成功!");
		return result;
	}
}
