package com.packages;

public class Packages {
	
	
	 private int packageID;
	   private String packageName;
	   private String Destination;
	   private String numOfDays;
	   private String numOfPassengers;
	   private String totalAmount;
	   
	   
	   public Packages(int packageID, String packageName, String Destination, String numOfDays, String numOfPassengers, String totalAmount) {
		this.packageID = packageID;
		this.packageName = packageName;
		this.Destination = Destination;
		this.numOfDays = numOfDays;
		this.numOfPassengers = numOfPassengers;
		this.totalAmount=totalAmount;
	}
	public int getId() {
		return packageID;
	}


	public String getName() {
		return packageName;
	}


	public String getDestination() {
		return Destination;
	}


	public String getDays() {
		return numOfDays;
	}


	public String getPassengers() {
		return numOfPassengers;
	}
	
	public String getAmount() {
		return totalAmount;
	}
	
	
	
	
	

}
