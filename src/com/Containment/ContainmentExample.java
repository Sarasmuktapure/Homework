package com.Containment;
import java.util.Scanner;
public class ContainmentExample 
{
	

	public static void main(String[] args)
	{
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter employee name:");
		String name=sc.nextLine();
		System.out.println("Enter employee ID:");
		int id=sc.nextInt();
		System.out.println("Enter employee salary:");
		float salary=sc.nextFloat();
		
		Address ad1=new Address();
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
		
		ad1.getAddressDetails(sno, pin, sname, city);
		e.getEmployeeDetails(id, name, salary, ad1);
		e.showEmployeeRecord();
		
		
		


	}

}
