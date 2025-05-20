package com.ds.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ds.entity.Employee;

public interface IEmployeeRepositery extends JpaRepository<Employee, Integer> {
	@Query(value="SELECT DATE_FORMAT (FROM_DAYS(DATEDIFF(NOW(),DOB)),'%Y')FROM JPA_JODA_EMPLOYEE WHERE EID=?1",nativeQuery = true)
  public float getEmpAgeById(int id);
}
