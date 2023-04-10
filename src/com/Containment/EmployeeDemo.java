package com.Containment;

public class EmployeeDemo 
{
	int empId;
	String empName;
	float salary;
	AddressDemo addr;
	
	
	public EmployeeDemo(int empId, String empName, float salary,AddressDemo addr)
	{
		System.out.println("Welcome to employee constructor");
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.addr=addr;
	}
	
	public void showEmployeeRecord() {
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee ID:"+empId);
		System.out.println("Monthly salary is Rs."+salary);
		this.addr.showAddress();
	}
	
	public void setAddr(AddressDemo ad1) {
		this.addr = addr;
	}

	


}
