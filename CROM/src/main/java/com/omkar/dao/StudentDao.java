package com.omkar.dao;

import com.omkar.model.Student;

import java.util.List;


public interface StudentDao {

	public void addStudent(Student student);

	public List<Student> listStudentss();

	public Student getStudent(int stuid);

	public void deleteStudent(Student student);
	
	

}
