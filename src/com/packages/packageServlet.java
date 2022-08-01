package com.packages;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/packageServlet")

//using inheritance

public class packageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		//Create String Variables For Store Inputed Values
		
		String packageName = request.getParameter("name");
		String Destination = request.getParameter("des");
		String numOfDays= request.getParameter("days");
		String numOfPassengers = request.getParameter("pass");
		String totalAmount = request.getParameter("tot");
		
		
		
		
boolean isTrue;
		
     //Pass Stored vlaues to packageDBUtill class
     //to insertpackage method

   
		isTrue = packageDBUtil.insertpackage(packageName,Destination,numOfDays, numOfPassengers,totalAmount);
		
		//Check if Database Connection is successfully connected or not
		
		if(isTrue == true) {
			
			//using RequestDispatcher
			//For navigate Servlet class to View(JSP)
			
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		

		
		
		
		
	}

}
