package com.usecase.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.employee.exception.EmployeeNotFoundException;
import com.usecase.employee.model.Employee;
import com.usecase.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class Controller {
	
    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.service.addEmployee(employee);
    }
    
    @GetMapping("/employeeId/{id}")
	public Employee findById(@PathVariable("id") Long id) {
    	
    		return service.findById(id);
    	
//    	Optional<Employee> opt = Optional.of(service.findById(id));
//    	Employee emp = opt.orElseThrow(
//    			()-> new EmployeeNotFoundException("Employee not exist"));
//    	return emp;
	}
	
	@GetMapping("/allEmployee")
	public List<Employee> findAllEmployee() {
//		LOGGER.info("Employee find");
		return service.findAllEmployee();
	}
	
	@GetMapping("/department/{departmentId}")
	public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId) {
//		LOGGER.info("Employee find: departmentId={}", departmentId);
		return service.findByDepartment(departmentId);
	}
	
	@GetMapping("/organization/{organizationId}")
	public List<Employee> findByOrganization(@PathVariable("organizationId") Long organizationId) {
//		LOGGER.info("Employee find: organizationId={}", organizationId);
		return service.findByOrganization(organizationId);
	}

}