package com.emp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.emp.entity.Employee;
import com.emp.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	
	@GetMapping("/get/all")
	public List<Employee> getAll(){
		return empService.getAll();
	}
	
	@PostMapping("/add")
	public List<Employee> add(@RequestBody Employee emp){
		return empService.add(emp);
	}
	
	@PutMapping("/edit")
	public List<Employee> edit(@RequestBody Employee emp){
		return empService.edit(emp);
	}
	
	@DeleteMapping("/delete")
	public List<Employee> delete(@RequestParam int empNo){
		return empService.delete(empNo);
	}
}