package com.packages;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;







public class packageDBUtil {
	
	//Boolean Variable for all methods
	
	private static boolean isSuccess;
	
	private static Connection con =null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	
	
	
	//Validation
public static List<Packages> validate(String packageID, String packageName){
		
		ArrayList<Packages> pack = new ArrayList<>();
		

		
		//variable
		try {
			
			
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			
			
			String sql ="select * from pack where packageID='"+packageID+"'and packageName='"+packageName+"'";
			rs=stmt.executeQuery(sql);
			
			
			if(rs.next()) {
				int packageID1 = rs.getInt(1);
				String packageName1 = rs.getString(2);
				String Destination = rs.getString(3);
				String numOfDays = rs.getString(4);
				String numOfPass = rs.getString(5);
				String totalAmount = rs.getString(6);
				
				Packages p = new Packages(packageID1,packageName1,Destination,numOfDays,numOfPass,totalAmount);
			    pack.add(p);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();

		}
		
		return pack;
		
		
	}

	

	
	
	
	//Insert- Transfer Inputed Details to Database Using insertpackage Mathod

	 public static boolean insertpackage(String packageName,String Destination, String numOfDays,String  numOfPassengers, String totalAmount) {
	    	
	    //	boolean  isSuccess = false;
	    	
	    	
	   //Exeption Handling-Using Try Catch for find errors in Data Base Connecion 	
		 
	    	try {
	    		
	    		con=DBconnect.getConnection();
	    	Statement	stmt = con.createStatement();
	    	
	    	    String sql = "insert into pack values (0,'"+packageName+"','"+Destination+"','"+numOfDays+"','"+numOfPassengers+"','"+totalAmount+"')";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			
	    			isSuccess = true;
	    			
	    		} else {
	    			
	    			isSuccess = false;
	    			
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		
	    		e.printStackTrace();
	    		
	    	}
	 	//value boolean value(0/1)
	    	return isSuccess;
	    }
		
	
	
	
	//Update
	 //Get Values from update Servlet class
	 
	 public static boolean updatepackage(String packID, String packName, String Desti, String nDays, String nPasseng, String totA) {
	    	
	    	try {
	    		
	    		con=DBconnect.getConnection();
	    		stmt = con.createStatement();
	    		
	    		String sql = "update pack set packageName='"+packName+"',Destination='"+Desti+"',numOfDays='"+nDays+"',numOfPassengers='"+nPasseng+"',totalAmount='"+totA+"'"
	    				+ "where packageID='"+packID+"'";
	    	
	    		//integer variable
	    		//rs return 0/1 
	    		//if update is success return 1 and not success return 0
	    		
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	 }
	 

	    
	
	
//return

public static List<Packages> getPackageDetails(String packageID){
	
	int convertedID=Integer.parseInt(packageID);
	
	
	ArrayList<Packages> pak=new ArrayList<>();
	
	try {
		
		con=DBconnect.getConnection();
		stmt = con.createStatement();
		
		String sql="select * from pack where packageID='"+convertedID+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int packageID1 = rs.getInt(1);
			String packageName = rs.getString(2);
			String Destination = rs.getString(3);
			String NummOfDays = rs.getString(4);
			String NumOfPassengers = rs.getString(5);
			String totalAmount = rs.getString(6);
			
			
			Packages c = new Packages(packageID1,packageName,Destination,NummOfDays,NumOfPassengers,totalAmount);
			 pak.add(c);
		}
		
		
		
		
		
		
	}catch(Exception e) {
		
		e.printStackTrace();
		
	}
	
	
	
	
	
	return pak;
	
}



//Delete

public static boolean deletePackage(String packageID) {
	//Convert id String to Int
	
	int convertedID=Integer.parseInt(packageID);
	
	try {
		
		con=DBconnect.getConnection();
		stmt = con.createStatement();
		
		String sql = "delete from pack where packageID='"+convertedID+"'";
		int r = stmt.executeUpdate(sql);
		
		if (r > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
	
		
	}
	
	catch (Exception e) {
		e.printStackTrace();
	
	}
	
	return isSuccess;
	
}
}

	

	


