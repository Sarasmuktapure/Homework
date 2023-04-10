package com.AccessSpecifier;

public class Account 
{
	private int acno;
	private String name;
	private float balance;
	
	public void openAccount()
	{
		fillCustDetails(12345,"Aditya",150000f);
	}
	private void fillCustDetails(int ano,String n,float b)
	{
		acno=ano;
		name=n;
		balance=b;
	}
	void showAccDetails()
	{
		System.out.println("Customer name: "+name);
		System.out.println("Account number: "+acno);
		System.out.println("Account balance: "+balance);
	}

	public static void main(String[] args) 
	{
		Account ac=new Account();
		ac.openAccount();
		ac.showAccDetails();
		
	}

}
//main method within the class
//here I declare private variables, private method,public method,default method and access these within same class
