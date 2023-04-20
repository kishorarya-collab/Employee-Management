package com.usecase.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.department.model.Department;
import com.usecase.department.model.Employee;
import com.usecase.department.repository.DepartmentRepository;
import com.usecase.department.repository.EmployeeRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	
	public Department addDepartment(Department department) {
		return this.departmentRepository.save(department);
	}

	public Department findByDepartmentId(Long departmentId) {
		return this.departmentRepository.findBydepartmentId(departmentId);
	}

	public List<Department> findAllDepartment() {
		return this.departmentRepository.findAll();
	}

	public List<Department> findByOrganizationId(Long organizationId) {
		return this.departmentRepository.findAllByorganizationId(organizationId);
	}

	public List<Employee> findByDepartmentWithEmployee(Long departmentId){
		return this.employeeRepository.findAllBydepartmentId(departmentId);
	}
//	

}
