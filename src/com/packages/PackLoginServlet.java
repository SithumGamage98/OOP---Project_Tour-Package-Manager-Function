package com.packages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/PackLoginServlet") 
//using inheritance
public class PackLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		
		String packageID=request.getParameter("pid");
		String packageName=request.getParameter("pn");
		
		try {
		List<Packages> packDetails=packageDBUtil.validate(packageID,packageName);
		request.setAttribute("packDetails",packDetails);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		//rederect to another class
		RequestDispatcher dis=request.getRequestDispatcher("adminaccount.jsp");
		dis.forward(request, response);
		
	}
		
		
		
		
		
		
		
	
	}


