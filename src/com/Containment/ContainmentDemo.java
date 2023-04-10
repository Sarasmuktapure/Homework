package com.Containment;

import java.util.Scanner;

public class ContainmentDemo {

	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name:");
		String name=sc.nextLine();
		System.out.println("Enter employee ID:");
		int id=sc.nextInt();
		System.out.println("Enter employee salary:");
		float salary=sc.nextFloat();
		
		System.out.println("Enter address details:");
		System.out.println("Enter society name:");
		sc.nextLine();
		String sname=sc.nextLine();
		System.out.println("Enter survey number:");
		int sno=sc.nextInt();
		System.out.println("Enter city name:");
		String city=sc.next();
		System.out.println("Enter PIN:");
		int pin=sc.nextInt();
		
		AddressDemo ad1=new AddressDemo(sno,pin,sname,city);
		EmployeeDemo ed=new EmployeeDemo(id,name,salary,ad1);
		
		ed.showEmployeeRecord();

	}

}
