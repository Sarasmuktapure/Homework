package com.Array;

import java.util.Scanner;

public class EmpDemo 
{
	int id;
	String name;
	int salary;
	
	EmpDemo(int id, String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;  
	}


	public static void main(String[] args) 
	{
		EmpDemo[]emp=new EmpDemo[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Enter the emp id");
			int eid=sc.nextInt();
			System.out.println("Enter the emp name");
			String ename=sc.next();
			System.out.println("Enter the salary");
			int sal=sc.nextInt();
			emp[i]=new EmpDemo(eid,ename,sal);
			System.out.println(emp[i]);
			System.out.println("-------------------------------");
			
			

	}
		

}
}
