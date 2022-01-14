package com.emp.repository;

import org.springframework.stereotype.Repository;
import com.emp.entity.Employee;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpRepository {
	
	public List<Employee> employee = new ArrayList<Employee>();

	public List<Employee> getAll() {
		return employee;
	}

	public List<Employee> add(Employee emp) {
		employee.add(emp);
		return employee;
	}

	public List<Employee> edit(Employee emp) {
		
		employee.stream().filter(e -> e.getEmployeeId() == emp.getEmployeeId()).forEach(e -> {
			e.setEnterpriseId(emp.getEnterpriseId());
			e.setName(emp.getName());
			e.setDateOfBirth(emp.getDateOfBirth());
			e.setDateOfJoining(emp.getDateOfJoining());
			e.setSalary(emp.getSalary());
			
		});
		
		return employee;
	}

	public List<Employee> delete(int empNo) {
		employee.remove(empNo-1);
		return employee;
	}
	
}