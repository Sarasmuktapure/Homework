package com.Inheritance;

public class SingleInheritance {

	public static void main(String[] args) 
	{
		//Manager m=new Manager();
		//m.getEmpDetails(4, "Saras", 50000f);
		//m.setIncentive(15000f);
		//m.showManagerDetails();
		
		
		//every time create the object of last child becoz it has all the properties of parents class
		SalesManager sm=new SalesManager();
		sm.getEmpDetails(6, "Rani", 47000f);
		sm.setIncentive(25000f);
		sm.setTarget(200f);
		sm.showSalesManagerDetails();

	}

}
