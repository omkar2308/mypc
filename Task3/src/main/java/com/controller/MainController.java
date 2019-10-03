package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Admin;
import com.entities.Student;
import com.services.AdminService;
import com.services.StudentService;

@Controller
/*@RequestMapping(value="users")*/
public class MainController 
{
	
	@Autowired
	AdminService adminservice;
	@Autowired
	StudentService stuservice;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView getPage()
	{
		ModelAndView model=new ModelAndView("hello");
		return model;
	}
	
	@RequestMapping(value="/ad", method=RequestMethod.GET)
	public ModelAndView getAdmin()
	{
		ModelAndView model=new ModelAndView();
		Admin admin=adminservice.getAdmin();
		model.addObject(admin);
		System.out.println(admin.getUserName());
		return model;
	}
	@RequestMapping(value="/AdminLogin")
	public ModelAndView adminLogin()
	{
		System.out.println("Inside admin login page");
		return new ModelAndView("AdminLogin");
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.POST)
	public ModelAndView adlogin(@RequestParam("userName") String userName, @RequestParam("password") String password, HttpServletRequest request, HttpServletResponse response)
	{
		
		HttpSession session=request.getSession();
		session.setAttribute("userName", userName);
		session.setAttribute("password", password);
		
		
		return new ModelAndView("redirect:/showStudents");
		
		/*String pass=adminservice.adminPassword(userName);
		if(pass!=null && pass.equals(password))
		{
			System.out.println("logged in");
			List<Student> studentList=stuservice.getStudentList();
			return new ModelAndView("ViewStudents","studentlist",studentList);
			
		}
		else
			return new ModelAndView("AdminLogin");*/
	
		
	}
	
	@RequestMapping(value="/showStudents", method=RequestMethod.GET)
	public ModelAndView showStudent(HttpServletRequest req)
	{
		HttpSession session=req.getSession(false);
		String userName=null,password=null,pass=null;
		
		if(session!=null)
		{
			userName=(String) session.getAttribute("userName");
			password=(String) session.getAttribute("password");
			pass=adminservice.adminPassword(userName);
		}
		
		if(pass!=null && pass.equals(password))
		{
			System.out.println("logged in");
			List<Student> studentList=stuservice.getStudentList();
			return new ModelAndView("ViewStudents","studentlist",studentList);
			
		}
		else
			return new ModelAndView("AdminLogin");
		
	}
	
	@RequestMapping(value="/Registration")
	public ModelAndView getRegForm()
	{
		
		return new ModelAndView("Register","command",new Student());
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView registerStudent( @ModelAttribute("Student") Student stu)
	{
			int id=stuservice.registerStudent(stu);
			if(id>0)
				return new ModelAndView("info","message","You are registered Your ID:"+id);
			else
				return new ModelAndView("redirect:/Registration","msg", "duplicate Email");
		
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView deleteStudent(HttpServletRequest req)
	 {
		int id=Integer.parseInt(req.getParameter("id"));
		System.out.println("Inside delete method");
		HttpSession session=req.getSession(false);
		
		System.out.println(session);
		if(session.getAttribute("userName")!=null)
		{
			System.out.println(id);
			int n=stuservice.deleteStudent(id);
			if(n==1)
			{
				System.out.println(n+"record deleted");
			}
		}
		
		return new ModelAndView("redirect:/showStudents");
	 }
	
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public ModelAndView edit(HttpServletRequest req)
	{
		int id=Integer.parseInt(req.getParameter("id"));
		Student s=new Student();
		s.setIdStudent(id);
		HttpSession session=req.getSession(false);
		if(session.getAttribute("userName")!=null)
		{
			ModelAndView model=new ModelAndView("Edit","command",s);
			return model;
		}
		else
			return new ModelAndView("redirect:/showStudents");
		
	}
	
	
	
	
	
	 @RequestMapping(value="/logout", method=RequestMethod.POST)
	 public ModelAndView logout(HttpServletRequest req)
	 {
		 System.out.println("Logging out");
		 HttpSession session=req.getSession(false);
		 session.invalidate();
		 System.out.println(session);
		 return new ModelAndView("AdminLogin");
	 }
	 
	 @RequestMapping(value="/actionEdit", method=RequestMethod.POST)
	 public ModelAndView actionEdit(@ModelAttribute("student") Student student)
	 {
		 int n=stuservice.updateStudent(student);
		 System.out.println(n+"record updated");
		 return new ModelAndView("redirect:/showStudents");
		 
	 }
	 
	 
	 @RequestMapping(value="/add")
		public ModelAndView add()
		{
			return new ModelAndView("Add","command",new Student());
		}
		
		@RequestMapping(value="/addStu", method=RequestMethod.POST)
		public ModelAndView addStu(@ModelAttribute("Student") Student stu)
		{
			int id=stuservice.registerStudent(stu);
			if(id>0)
				return new ModelAndView("redirect:/showStudents");
			else
				return new ModelAndView("redirect:/add");
			
		}
	 
	 
	
	 @RequestMapping(value="/addStudent", method=RequestMethod.POST)
	 public ModelAndView addStudent()
	 {
		 return new ModelAndView("redirect:/add");
	 }

}
