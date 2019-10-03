package com.services;

import java.util.List;

import com.entities.Student;

public interface StudentService 
{
	public List<Student> getStudentList();

	public int registerStudent(Student stu);

	public int deleteStudent(int id);

	public int updateStudent(Student student);

}
