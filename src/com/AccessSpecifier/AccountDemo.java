package com.AccessSpecifier;

public class AccountDemo 
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
}


