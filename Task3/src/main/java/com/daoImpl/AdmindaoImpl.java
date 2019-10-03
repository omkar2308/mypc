package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Admindao;
import com.entities.Admin;

@Repository
@Transactional
public class AdmindaoImpl implements Admindao
{
	@Autowired
	SessionFactory sessionFactory;

	public Admin getAdmin() 
	{
		
		return (Admin) sessionFactory.getCurrentSession().get(Admin.class, 1);
		
	}

	public String adminPassword(String userName) 
	{
		String pass=null;
		//System.out.println("before password");
		
		Query query= sessionFactory.getCurrentSession().createQuery("select password from Admin where userName=?");
		query.setString(0, userName);
		List<String> list=null;
		try 
		{
			list=query.list();
			
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		if(!list.isEmpty()&&list!=null)
		{
			pass=list.get(0);
		}
		System.out.println(pass);
		return pass;
	}
	

}
