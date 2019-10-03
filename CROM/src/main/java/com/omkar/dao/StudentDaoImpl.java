package com.omkar.dao;

import com.omkar.model.Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("studentdao")

public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addStudent(Student student) {

		sessionFactory.getCurrentSession().saveOrUpdate(student);

	}

	@SuppressWarnings("unchecked")
	public List<Student> listStudentss() {

		return (List<Student>) sessionFactory.getCurrentSession().createCriteria(Student.class).list();

	}

	public Student getStudent(int stuid) {

		return (Student) sessionFactory.getCurrentSession().get(Student.class, stuid);

	}

	
	public void deleteStudent(Student student) {

		Session se = sessionFactory.getCurrentSession();
		se.createQuery("DELETE FROM Student WHERE stuid=" + student.getStuId()).executeUpdate();

	}

}
