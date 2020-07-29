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
import com.neusoft.hotel.customer.model.OrderModel;
import com.neusoft.hotel.customer.service.IOrderService;

@RestController
@RequestMapping("/Order")
@CrossOrigin(origins = {"*", "null"})
public class OrderController {
	
	@Autowired
	private IOrderService os = null;
	
	@PostMapping(value="/add")
	public Result<String> add(@RequestBody OrderModel om) throws Exception {
		os.add(om);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("增加顾客成功");
		return result;
	}
	
	@PostMapping(value="/modify")
	public Result<String> modify(@RequestBody OrderModel om) throws Exception {
		os.modify(om);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("修改顾客成功");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestBody OrderModel om) throws Exception {
		os.delete(om);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("删除顾客成功");
		return result;
	}
	
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<OrderModel> getListByAllWithPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1")int page) throws Exception {
		Result<OrderModel> result = new Result<OrderModel>();
		result.setPageCount(os.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(os.getListByAllWithPage(rows, page));
		result.setCount(os.getCountByAll());
		
		
		result.setStatus("Fine");
		result.setMessage("取得顾客列表分页成功");
		return result;
	}
	
	
	@GetMapping(value="/get")
	public Result<OrderModel> getByNo(@RequestParam(required=true)int id) throws Exception {
		Result<OrderModel> result = new Result<OrderModel>();
		result.setResult(os.getById(id));
		
		
		result.setStatus("Fine");
		result.setMessage("取得指定顾客对象成功");
		return result;
	}
}