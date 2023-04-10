package com.Inheritance;

public class EmpSingle 
{
	int empId;
	String empName;
	float salary;
	public void getEmpDetails(int empId,String empName,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	public void showEmpRecord()
	{
		System.out.println("Name= "+empName);
		System.out.println("Id= "+empId);
		System.out.println("salary rs.= "+salary);
	}
	public String toString()
	{
		String str="Emp name: "+empName+" Emp id: "+empId+" Emp salary is: Rs."+salary;
		return str;
	}
}
class Manager extends EmpSingle
{
	float incentive;
	public void setIncentive(float val)
	{
		incentive=val;
	}
	public float getIncentive()
	{
		return incentive;
	}
	public void showManagerDetails()
	{
		showEmpRecord();
		System.out.println("Incentive paid is rs."+getIncentive());
	}
}

	//multilevel inheritance
class SalesManager extends Manager
{
	float target;
	public void setTarget(float val)
	{
		target=val;
	}
	public float getTarget()
	{
		return target;
	}
	public void showSalesManagerDetails()
	{
		showManagerDetails();
		System.out.println("Target to be achieved for the month is= "+target);
	}
}
