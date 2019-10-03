package com.omkar.service;

import java.util.List;

import com.omkar.model.Student;

public interface StudentService {

	public void addStudent(Student student);

	public List<Student> listStudentss();

	public Student getStudent(int stuid);

	public void deleteStudent(Student student);

}
