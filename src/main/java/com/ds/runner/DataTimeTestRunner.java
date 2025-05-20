package com.ds.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ds.entity.Employee;
import com.ds.service.IEmployeeMgmtService;
@Component
public class DataTimeTestRunner implements CommandLineRunner {
	@Autowired
  private IEmployeeMgmtService empService;
	@Override
	public void run(String... args) throws Exception {
		//create entity object
		/*	Employee emp=new Employee();
		emp.setEname("Vishal");
		emp.setEadd("Vijayawada");
		emp.setDob( LocalDateTime.of(1960,10,30,11,50,34));
		emp.setDoj(LocalDate.of(1985, 07,18));
		emp.setToj(LocalTime.of(10,25,30));
		//save object
		String msg=empService.registerEmployee(emp);
		System.out.println(msg);*/
		empService.showAllEmployees().forEach(System.out::println);
		System.out.println("emp age"+empService.findEmpAgeById(1));
	}

}
