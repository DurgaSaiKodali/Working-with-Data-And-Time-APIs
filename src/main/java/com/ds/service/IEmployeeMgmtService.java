package com.ds.service;

import java.util.List;

import com.ds.entity.Employee;

public interface IEmployeeMgmtService {
	public String registerEmployee(Employee emp);
	public List<Employee> showAllEmployees();
	public float findEmpAgeById(int id);

}
