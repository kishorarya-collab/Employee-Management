package com.usecase.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.employee.model.Employee;
import com.usecase.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	public Employee addEmployee(Employee employee) {
		return this.repo.save(employee);	
	}
	
	public Employee findById(Long id) {
		return this.repo.findByid(id);
		
	}
	
	public List<Employee> findByDepartment(Long departmentid) {
		return this.repo.findAllBydepartmentId(departmentid);
	}
	
	public List<Employee> findByOrganization(Long organizationid) {
		return this.repo.findAllByorganizationId(organizationid);
	}
	
	public List<Employee> findAllEmployee(){
		return this.repo.findAll();
	}
}
