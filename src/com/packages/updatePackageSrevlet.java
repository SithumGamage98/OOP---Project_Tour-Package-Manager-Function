package com.packages;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updatePackageSrevlet")
public class updatePackageSrevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		//Get Details From Update Form
		//create variables for store values
		
		String packageID=request.getParameter("packid");
		String packageName=request.getParameter("pname");
		String Destination=request.getParameter("dest");
		String numOfDays=request.getParameter("days");
		String numOfPassengers=request.getParameter("pass");
		String totalAmount=request.getParameter("tot");
		
		//Check if Database Connection is Successfull or not using isTrue
		
boolean isTrue;
		
//Send Stored Values to packageDBUtil class
//to updatepackage Method

		isTrue = packageDBUtil.updatepackage(packageID,packageName,Destination,numOfDays,numOfPassengers,totalAmount);
		
		if(isTrue == true) {
			List<Packages> packDetails= packageDBUtil.getPackageDetails(packageID);
			request.setAttribute("packDetails",packDetails);
			
			//use Dispatcher for Navigate Succes.jsp
			RequestDispatcher dis = request.getRequestDispatcher("adminaccount.jsp");
			dis.forward(request, response);
		} else {
			
			//use Dispatcher for Navigate unSucces,jsp
			List<Packages> packDetails= packageDBUtil.getPackageDetails(packageID);
			request.setAttribute("packDetails",packDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("adminaccount.jsp");
			dis.forward(request, response);
		}
		
		
		
	}


	
}
