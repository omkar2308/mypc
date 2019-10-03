package com.services;

import com.entities.Admin;

public interface AdminService 
{
	public Admin getAdmin();

	public String adminPassword(String userName);

}
