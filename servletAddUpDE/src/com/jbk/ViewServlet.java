package com.jbk;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/ViewServlet")  
public class ViewServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='index.html'>Add New student</a>");  
        out.println("<h1>Student List</h1>");  
          
        List<Stu> list=StuDao.getAllStudent();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th>  <th>Edit</th><th>Delete</th></tr>");  
        for(Stu e:list){  
        	//System.out.println("1");
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td>  <td>"+e.getEmail()+"</td><td>"+e.getCountry()+"</td><td><a href='EditServlet?id="+e.getId()+"'>edit</a></td>  <td><a href='DeleteServlet?id="+e.getId()+"'>delete</a></td></tr>");  
         //System.out.println("2");
         } // System.out.println("3");
        out.print("</table>");  
       // System.out.println("4");
          
        out.close();  
    }  
}  