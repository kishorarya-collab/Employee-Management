package com.usecase.organization.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.organization.model.Organization;
import com.usecase.organization.service.OrganizationService;


@RestController
@RequestMapping("/organization")
public class Controller {

//	private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationController.class);
	
	@Autowired
	private OrganizationService organizationService;
	
	@PostMapping("/addOrganization")
	public Organization add(@RequestBody Organization organization) {
		return this.organizationService.addOrganization(organization);
	}
	
	@GetMapping("/allOrganization")
	public List<Organization> findAll() {
		return this.organizationService.findAllOrganization();
	}
	
	@GetMapping("/organizationId/{id}")
	public Organization findByOrganizationId(@PathVariable("id") Long organizationId) {
		return this.organizationService.findByorganizationId(organizationId);
	}

//	@GetMapping("/{id}/with-departments")
//	public Organization findByIdWithDepartments(@PathVariable("id") Long id) {
//		Organization organization = repository.findById(id);
//		organization.setDepartments(departmentClient.findByOrganization(organization.getId()));
//		return organization;
//	}
//	
//	@GetMapping("/{id}/with-departments-and-employees")
//	public Organization findByIdWithDepartmentsAndEmployees(@PathVariable("id") Long id) {
//		Organization organization = repository.findById(id);
//		organization.setDepartments(departmentClient.findByOrganizationWithEmployees(organization.getId()));
//		return organization;
//	}
//	
//	@GetMapping("/{id}/with-employees")
//	public Organization findByIdWithEmployees(@PathVariable("id") Long id) {
//		Organization organization = repository.findById(id);
//		organization.setEmployees(employeeClient.findByOrganization(organization.getId()));
//		return organization;
//	}
	
}
