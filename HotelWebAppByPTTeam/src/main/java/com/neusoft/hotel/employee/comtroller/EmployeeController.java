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
import com.neusoft.hotel.employee.model.EmployeeModel;
import com.neusoft.hotel.employee.service.IEmployeeService;

@RestController
@RequestMapping("/Employee")
@CrossOrigin(origins = { "*", "null" })
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService = null;

	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody EmployeeModel employeeModel) throws Exception {
		employeeService.add(employeeModel);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("增加雇员成功");
		return result;
	}

	@PostMapping(value = "/modify")
	public Result<String> modify(@RequestBody EmployeeModel employeeModel) throws Exception {
		employeeService.modify(employeeModel);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("修改雇员成功");
		return result;
	}

	@PostMapping(value = "/delete")
	public Result<String> delete(@RequestBody EmployeeModel employeeModel) throws Exception {
		employeeService.delete(employeeModel);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("删除雇员成功");
		return result;
	}

	@GetMapping(value = "/get")
	public Result<EmployeeModel> getByEmployeeID(@RequestParam(required = true) int employeeID) throws Exception {
		Result<EmployeeModel> result = new Result<EmployeeModel>();
		result.setResult(employeeService.getByEmployeeID(employeeID));
		result.setStatus("Fine");
		result.setMessage("取得指定雇员成功");
		return result;
	}

	// 简化版list
	@GetMapping(value = "/list")
	public Result<EmployeeModel> getListByAll() throws Exception {
		Result<EmployeeModel> result = new Result<EmployeeModel>();
		result.setList(employeeService.getByAll());
		result.setStatus("Fine");
		result.setMessage("取得雇员列表成功");
		return result;
	}
}
