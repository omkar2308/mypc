package com.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Admindao;
import com.entities.Admin;
import com.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	Admindao admin;
	
	
	public Admin getAdmin() 
	{
		
		return admin.getAdmin();
	}

	public String adminPassword(String userName) 
	{
		
		return admin.adminPassword(userName);
	}
	
}

