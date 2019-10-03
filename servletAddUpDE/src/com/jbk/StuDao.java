package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StuDao  {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Stu e){  
        int status=0;  
        try{  
            Connection con=StuDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into user(name,password,email,country) values (?,?,?,?)");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Stu e){  
        int status=0;  
        try{  
            Connection con=StuDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update user set name=?,password=?,email=?,country=? where id=?");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
            ps.setInt(5,e.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=StuDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from user where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Stu getStudentById(int id){  
    	Stu e=new Stu();  
          
        try{  
            Connection con=StuDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Stu> getAllStudent(){  
        List<Stu> list=new ArrayList<Stu>();  
          
        try{  
            Connection con=StuDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
            	Stu e=new Stu();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  