
package com.omkar.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.omkar.bean.StudentBean;
import com.omkar.model.Student;
import com.omkar.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	public StudentService studentService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)

	public ModelAndView saveStudnet(@ModelAttribute("command") StudentBean studentBean, BindingResult result)

	{
		Student studnet = prepareModel(studentBean);
		studentService.addStudent(studnet);
		return new ModelAndView("redirect:/add.html");
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ModelAndView listStudents() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("students", prepareListofBean(studentService.listStudentss()));
		return new ModelAndView("studentsList", model);
	}

	// for add the student database.....

	@RequestMapping(value = "/add", method = RequestMethod.GET)

	public ModelAndView addStudent(@ModelAttribute("command") StudentBean studentBean, BindingResult result)

	{

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("students", prepareListofBean(studentService.listStudentss()));
		return new ModelAndView("addStudent", model);
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {

		return new ModelAndView("index");

	} 

	@RequestMapping(value = "/delete", method = RequestMethod.GET)

	public ModelAndView editStudent(@ModelAttribute("command") StudentBean studentBean, BindingResult result)

	{

		studentService.deleteStudent(prepareModel(studentBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("students", null);
		model.put("students", prepareListofBean(studentService.listStudentss()));

		return new ModelAndView("addStudent", model);

	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)

	public ModelAndView deleteStudent(@ModelAttribute("command") StudentBean studentBean, BindingResult result) {

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("student", prepareStudentBean(studentService.getStudent(studentBean.getId())));
		model.put("students", prepareListofBean(studentService.listStudentss()));

		return new ModelAndView("addStudent", model);
	}

	//Logic for login controller:
	
	private Student prepareModel(StudentBean studentBean) {

		Student student = new Student();

		student.setStuFname(studentBean.getFname());
		student.setStuLname(studentBean.getLname());
		student.setStuEmail(studentBean.getEmail());
		student.setStuAddress(studentBean.getAddress());

		student.setStuId(studentBean.getId());
		studentBean.setId(null);

		return student;

	}

	private List<StudentBean> prepareListofBean(List<Student> students) {

		List<StudentBean> beans = null;

		if (students != null && !students.isEmpty()) {

			beans = new ArrayList<StudentBean>();
			StudentBean bean = null;
			for (Student student : students) {

				bean = new StudentBean();
				bean.setId(student.getStuId());

				bean.setFname(student.getStuFname());

				bean.setLname(student.getStuLname());

				bean.setEmail(student.getStuEmail());

				bean.setAddress(student.getStuAddress());

				beans.add(bean);
			}

		}
		return beans;

	}

	private StudentBean prepareStudentBean(Student student) {

		StudentBean bean = new StudentBean();
		bean.setId(student.getStuId());
		bean.setFname(student.getStuFname());
		bean.setLname(student.getStuLname());
		bean.setEmail(student.getStuEmail());
		bean.setAddress(student.getStuAddress());
		return bean;

	}

}
