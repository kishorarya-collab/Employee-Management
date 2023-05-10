package com.usecase.employee.controller;


import java.util.List;

import com.usecase.employee.model.Department;
import com.usecase.employee.model.Organization;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.employee.model.Employee;
import com.usecase.employee.service.impl.IEmployeeServiceImpl;

import ch.qos.logback.classic.Logger;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employee")
public class Controller {
	
    @Autowired
    private IEmployeeServiceImpl service;

//	@Autowired
//	private RestTemplate restTemplate;

    
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.service.addEmployee(employee);
    }
    
    @GetMapping("/employeeId/{id}")
	public ResponseEntity<Employee> findById(@PathVariable("id") Long id) {
    	
    	Employee employee=service.findById(id);
    	
    		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
    	
	}
	
	@GetMapping("/allEmployee")
	public List<Employee> findAllEmployee() {
		return service.findAllEmployee();
	}
	
	@GetMapping("/department/{departmentId}")
	public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId) {
		return service.findByDepartment(departmentId);
	}
	
	@GetMapping("/organization/{organizationId}")
	public List<Employee> findByOrganization(@PathVariable("organizationId") Long organizationId) {
		return service.findByOrganization(organizationId);
	}
	
	@DeleteMapping("/delete/{deleteId}")
	public String deleteById(@PathVariable("deleteId") Long deleteId) {
		
		return service.deleteById(deleteId);
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllEmployee() {
		service.deleteAllEmployee();
		return "All Employees has been deleted";
	}
	
	@PutMapping("update/{employeeId}")
	public Employee updateEmployee(@PathVariable("employeeId") Long employeeId, @RequestBody Employee employee) {

		return service.updateEmployee(employeeId,employee);
	}

	@CircuitBreaker(name = "employee-service", fallbackMethod = "employeeFallback")
	@GetMapping("/getDepartmentDetails/{employeeId}")
	public ResponseEntity<Department> getDepartmentDetails(@PathVariable("employeeId") Long employeeId){
		Employee employee=this.service.findById(employeeId);
		RestTemplate restTemplate= new RestTemplate();
		Department department=restTemplate.getForObject("http://localhost:8999/department/departmentId/"+employee.getDepartmentId(),Department.class);
		return new ResponseEntity<Department>(department,HttpStatus.OK);
	}

	@CircuitBreaker(name = "employee-service", fallbackMethod = "employeeFallback")
	@GetMapping("/getOrganizationDetails/{employeeId}")
	public ResponseEntity<Organization> getOrganizationDetails(@PathVariable("employeeId") Long employeeId){
		Employee employee=this.service.findById(employeeId);
		RestTemplate restTemplate= new RestTemplate();
		Organization organization=restTemplate.getForObject("http://localhost:8999/organization/organizationId/"+employee.getOrganizationId(), Organization.class);
		return new ResponseEntity<Organization>(organization,HttpStatus.OK);
	}

	public ResponseEntity<String> employeeFallback(Exception e){
		return new ResponseEntity<String>("service is down",HttpStatus.OK);
	}
}