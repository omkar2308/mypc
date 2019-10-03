package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Studentdao;
import com.entities.Student;
import com.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	Studentdao studao;

	public List<Student> getStudentList() 
	{
		return studao.getStudentList();
	}

	public int registerStudent(Student stu) 
	{
		return studao.registerStudent(stu);
	}

	public int deleteStudent(int id) 
	{
		return studao.deleteStudent(id);
	}
	public int updateStudent(Student student) 
	{
		return studao.updateStudent(student);
	}

}
