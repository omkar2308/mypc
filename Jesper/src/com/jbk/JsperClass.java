package com.jbk;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JsperClass extends HttpServlet {
	Connection con;
	private Object ak ="";
	protected void service (HttpServletRequest request, HttpServletResponse response)  
			  throws ServletException, IOException {
		
		try {
			Conn c=new Conn();
			con=c.getCon();
			HashMap<String, Object>param =new HashMap<String, Object>();
			param.put("name", ak );
			param.put("email", ak );
			
			String jrxmlfile =request.getRealPath("");
			InputStream input=new FileInputStream(new File(jrxmlfile));
			
			JaspeReport jr= JasperCompileManager.compileReport(input);
			JasperPrint jp=JasperFillManager.fillReport(jr,param,con);
			JasperExportManager.exportReportToPdfStream(jp,response.getOutputStream());
			
			JasperViewer jw=new JasperViewer(jp,false);
			jw.setVisible(true);
			response.getOutputStream().flush();
			response.getOutputStream().close();
			
		}catch (Exception e ) {
			System.out.println(e);
		}
		
	}

}
