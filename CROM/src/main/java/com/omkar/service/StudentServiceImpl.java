package com.omkar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.omkar.dao.StudentDao;
import com.omkar.model.Student;

@Service("studentService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)

	public void addStudent(Student student) {

		studentDao.addStudent(student);

	}

	public List<Student> listStudentss() {
		// TODO Auto-generated method stub

		return studentDao.listStudentss();
	}

	public Student getStudent(int stuid) {

		return studentDao.getStudent(stuid);

	}

	public void deleteStudent(Student student) {

		studentDao.deleteStudent(student);
	}

}
