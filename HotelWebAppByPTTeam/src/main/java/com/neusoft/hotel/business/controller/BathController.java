package com.neusoft.hotel.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.Result.Result;
import com.neusoft.hotel.business.model.BathModel;
import com.neusoft.hotel.business.service.IBathService;

@RestController
@RequestMapping(value="/bath")
@CrossOrigin(origins = {"*", "null"})
public class BathController {
	@Autowired
	private IBathService bs=null;
		
	@PostMapping(value="/add")
	public Result<String> add(BathModel dm) throws Exception{
		bs.add(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加服务项目成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(BathModel dm) throws Exception{
		bs.modify(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改服务项目成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(BathModel dm) throws Exception{
		bs.delete(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除服务项目成功!");
		return result;
	}
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<BathModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
		Result<BathModel> result=new Result<BathModel>();
		result.setCount(bs.getCountByAll());
		result.setPageCount(bs.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(bs.getListByAllWithPage(rows, page));
		
		result.setStatus("OK");
		result.setMessage("取得服务项目列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<BathModel> getByNo(@RequestParam(required=true) int id) throws Exception{
		Result<BathModel> result=new Result<BathModel>();
		result.setResult(bs.getByNo(id));
		
		result.setStatus("OK");
		result.setMessage("取得指定服务项目对象成功!");
		return result;
	}

}
