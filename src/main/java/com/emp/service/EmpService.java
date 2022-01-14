package com.emp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.entity.Employee;
import com.emp.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	EmpRepository empRepository;

	
	public List<Employee> getAll(){
		return empRepository.getAll();
	}


	public List<Employee> add(Employee emp) {
		
		return empRepository.add(emp);
	}


	public List<Employee> edit(Employee emp) {
		// TODO Auto-generated method stub
		return empRepository.edit(emp);
	}


	public List<Employee> delete(int empNo) {
		return empRepository.delete(empNo);
	}
}
