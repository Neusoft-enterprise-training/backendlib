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
import com.neusoft.hotel.employee.model.GroupModel;
import com.neusoft.hotel.employee.service.IEmployeeService;
import com.neusoft.hotel.employee.service.IGroupService;

@RestController
@RequestMapping("/Group")
@CrossOrigin(origins = { "*", "null" })
public class GroupController {

	@Autowired
	private IGroupService groupService = null;

	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody GroupModel groupModel) throws Exception {
		groupService.add(groupModel);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("增加组成功");
		return result;
	}

	@PostMapping(value = "/modify")
	public Result<String> modify(@RequestBody GroupModel groupModel) throws Exception {
		groupService.modify(groupModel);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("修改组成功");
		return result;
	}

	@PostMapping(value = "/delete")
	public Result<String> delete(@RequestBody GroupModel groupModel) throws Exception {
		groupService.delete(groupModel);
		Result<String> result = new Result<String>();
		result.setStatus("Fine");
		result.setMessage("删除组成功");
		return result;
	}

	@GetMapping(value = "/get")
	public Result<GroupModel> getByEmployeeID(@RequestParam(required = true) int groupID) throws Exception {
		Result<GroupModel> result = new Result<GroupModel>();
		result.setResult(groupService.getByGroupID(groupID));
		result.setStatus("Fine");
		result.setMessage("取得指定组成功");
		return result;
	}

	// 简化版list
	@GetMapping(value = "/list")
	public Result<GroupModel> getListByAll() throws Exception {
		Result<GroupModel> result = new Result<GroupModel>();
		result.setList(groupService.getByAll());
		result.setStatus("Fine");
		result.setMessage("取得组列表成功");
		return result;
	}
}
