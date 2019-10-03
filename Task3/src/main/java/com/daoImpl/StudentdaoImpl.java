package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Studentdao;
import com.entities.Student;

@Repository
@Transactional
public class StudentdaoImpl implements Studentdao 
{
	@Autowired
	SessionFactory sessionFactory;

	public List<Student> getStudentList() 
	{
		List<Student> studentList=sessionFactory.getCurrentSession().createCriteria(Student.class).list();
		
		return studentList;
	}

	public int registerStudent(Student stu) 
	{
		int id=0;
		
		Query query=sessionFactory.getCurrentSession().createQuery("from Student where Email=?");
		query.setString(0, stu.getEmail());
		List<Student> list=query.list();
		if(list.isEmpty())
		{
			try 
			{
				 id=(Integer) sessionFactory.getCurrentSession().save(stu);
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
				
			}
			
		}
		
		
		return id;
	}

	public int deleteStudent(int id) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("delete from Student where idStudent=?");
		query.setParameter(0, id);
		int n=query.executeUpdate();
		return n;
	}

	public int updateStudent(Student student) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("update Student set Name=?, Email=?, Age=?, Gender=?, Country=? where idStudent=?");
		query.setString(0, student.getName());
		query.setString(1, student.getEmail());
		query.setInteger(2, student.getAge());
		
		query.setString(3, student.getGender());
		query.setString(4, student.getCountry());
		query.setInteger(5, student.getIdStudent());
		int n=query.executeUpdate();
		return n;
	}

}
