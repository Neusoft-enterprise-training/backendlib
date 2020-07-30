package com.neusoft.hotel.employee.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.Result.Result;
import com.neusoft.hotel.employee.model.RecordModel;
import com.neusoft.hotel.employee.service.IRecordService;

@RestController
@RequestMapping("/Record")
@CrossOrigin(origins = { "*", "null" })
public class RecordController {

	@Autowired
	private IRecordService recordService = null;

	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody RecordModel recordModel) throws Exception {
		recordService.add(recordModel);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("增加记录成功");
		return result;
	}

	@PostMapping(value = "/delete")
	public Result<String> delete(@RequestBody RecordModel recordModel) throws Exception {
		recordService.delete(recordModel);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("删除记录成功");
		return result;
	}

	@GetMapping(value = "/get")
	public Result<RecordModel> getByEmployeeID(@RequestParam(required = true) int employeeID) throws Exception {
		Result<RecordModel> result = new Result<RecordModel>();
		result.setList(recordService.getByEmployeeID(employeeID));
		result.setStatus("Fine");
		result.setMessage("取得指定记录成功");
		return result;
	}

	// 简化版list
	@GetMapping(value = "/list")
	public Result<RecordModel> getByAll() throws Exception {
		Result<RecordModel> result = new Result<RecordModel>();
		result.setList(recordService.getByAll());
		result.setStatus("Fine");
		result.setMessage("取得所有记录成功");
		return result;
	}
}
