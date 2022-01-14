package com.emp;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emp.entity.Employee;
import com.emp.repository.EmpRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	EmpRepository empRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1234, "ram@accenture.com", "Ram", "10/09/1999", "28/10/2021", 34000);
		Employee e2 = new Employee(1235, "arun@accenture.com", "Arun", "24/05/1998", "28/10/2022", 50000);
		
		empRepository.employee.addAll(Arrays.asList(e1, e2));
	}

}
