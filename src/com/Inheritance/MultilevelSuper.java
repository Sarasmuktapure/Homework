package com.Inheritance;

class Department{
	int id;
	String name;
	Department(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

class Person extends Department{
	String city;
	int pincode;
	Person(int id,String name,String city,int pincode)
	{
		super(id,name);
		this.city=city;
		this.pincode=pincode;
	}
	
}

class Employee extends Person{
	float salary;
	Employee(int id,String name,String city,int pincode,float salary)
	{
		super(id,name,city,pincode);
		this.salary=salary;
	}
	public void showDetails()
	{
		System.out.println(id+" "+name+" "+city+" "+pincode+" "+salary);
	}
}







public class MultilevelSuper {

	public static void main(String[] args)
	{
		Employee e=new Employee(12,"Aditya","Latur",413512,50000);
		e.showDetails();

	}

}
