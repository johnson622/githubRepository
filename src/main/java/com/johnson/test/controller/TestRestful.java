package com.johnson.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.johnson.test.result.Result;

import io.swagger.annotations.ApiOperation;

@RestController 
public class TestRestful {
	
	@GetMapping("/getAuthority")
	public Result<Map<String, Object>> getAuthority(){
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("flag", true);
		return Result.success(resultMap);
	}
	
	@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
	@GetMapping("/getDepartment")
	public Result<Map<String, Object>> getDepartment(){
		Map<String,Object> resultMap = new HashMap<String, Object>();
		
		List<String> departmentList = new ArrayList<String>();
		departmentList.add("开发部");
		departmentList.add("销售部");
		departmentList.add("会计部");
		
		resultMap.put("departmentList", departmentList);
		return Result.success(resultMap);
	}
	
	@GetMapping("/getProject")
	public Result<Map<String, Object>> getProject(){
		Map<String,Object> resultMap = new HashMap<String, Object>();
		List<String> projectList = new ArrayList<String>();
		projectList.add("项目1");
		projectList.add("项目3");
		resultMap.put("projectList", projectList);
		return Result.success(resultMap);
	}
	
	@GetMapping("/queryData")
	public Map<String,String> queryData(
			@RequestParam(name="date") String date ,
			@RequestParam(name="project") String project ,
			@RequestParam(name="department") String Department 
			){
		Map<String,String> resultMap = new HashMap<String, String>();
		resultMap.put("code", "00");

		resultMap.put("message", "放大fafeaef");

		resultMap.put("code", "00");
		resultMap.put("message", "请求成功");
		return resultMap ;
	}
}
