package com.Containment;

public class Employee
{
	int empId;
	String empName;
	float salary;
	Address addr;
	
	public void getEmployeeDetails(int empId, String empName, float salary, Address addr)
	{
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
	
	public void setAddress(Address ad)
	{
		addr=ad;
	}

}
