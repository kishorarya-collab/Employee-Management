package com.usecase.organization.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.organization.model.Organization;
import com.usecase.organization.repository.OrganizationRepository;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationRepository organizationRepository;

	public Organization addOrganization(Organization organization) {
		return this.organizationRepository.save(organization);
	}

	public List<Organization> findAllOrganization() {
		return this.organizationRepository.findAll();
	}

	public Organization findByorganizationId(Long organizationId) {
		return this.organizationRepository.findByorganizationId(organizationId);
	}
	
	
}
