package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.core.ApplicationContext;

import com.bean.Student;

public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getParameter("action");
	
	ApplicationContext a=new 
	
	    if(action.equalsIgnoreCase("insert"))
	    {
	    	Student s=new Student();
	    	s.setFname(request.getParameter("fname"));
	    	s.setLname(request.getParameter("lname"));
	    	s.setEmail(request.getParameter("email"));
	    }
	
	}

}
