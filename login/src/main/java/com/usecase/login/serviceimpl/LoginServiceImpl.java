package com.usecase.login.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.login.model.Login;
import com.usecase.login.repository.LoginRepository;
import com.usecase.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository repo;
	
	@Override
	public Login username(String username) {
		return this.repo.findByusername(username);
	}
}
