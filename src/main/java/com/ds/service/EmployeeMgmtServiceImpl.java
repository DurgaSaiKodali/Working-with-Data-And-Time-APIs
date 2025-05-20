package com.ds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.entity.Employee;
import com.ds.repositery.IEmployeeRepositery;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
    private IEmployeeRepositery empRepo;
	@Override
	public String registerEmployee(Employee emp) {
		int idVal=empRepo.save(emp).getEid();
		return "employee is saved with id value:"+idVal;
	}
	@Override
	public List<Employee> showAllEmployees() {
		
		return empRepo.findAll();
	}
	@Override
	public float findEmpAgeById(int id) {
		return empRepo.getEmpAgeById(id);
		
	}

}
