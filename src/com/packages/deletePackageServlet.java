package com.packages;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/deletePackageServlet")
//Inheritance
public class deletePackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String packageID = request.getParameter("packid");
		boolean isTrue;
		
		isTrue = packageDBUtil.deletePackage(packageID);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("insertpack.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			
			List<Packages> packDetails= packageDBUtil.getPackageDetails(packageID);
			request.setAttribute("packDetails",packDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("adminaccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}
		
		
		
		
	

}
