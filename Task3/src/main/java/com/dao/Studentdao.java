package com.dao;

import java.util.List;

import com.entities.Student;

public interface Studentdao 
{
	public List<Student> getStudentList();

	public int registerStudent(Student stu);

	public int deleteStudent(int id);

	public int updateStudent(Student student);

}
