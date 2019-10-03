package com.dao;

import com.entities.Admin;

public interface Admindao 
{
	public Admin getAdmin();

	public String adminPassword(String userName);

}