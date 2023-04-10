package com.Static;

public class AccDemo1 
{
	private int acno;
	protected String name;
	private float balance;
	
	public static String bankName;
	public static float iRate;
	
	static
	{
		System.out.println("static block1 executed");
		bankName="ICICI Bank";
	}
	
	{
		System.out.println("Instance block1 executed");
		acno=547698786;
		name="mr.Ninad";
		
	}
	
	public static void changeInterestRate(float newRate)
	{
		iRate=newRate;
		System.out.println("Static method invoked from static block also");
	}
	
	{
		System.out.println("Instance block2 executed");
		balance=78000f;
		showAccountDetails();
	}
	
	static
	{
		System.out.println("static block2 executed");
		iRate=0.07f;
		changeInterestRate(6.9f);
	}
	
	void showAccountDetails()
	{
		System.out.println("Customer name is= "+name);
		System.out.println("Account number= "+acno+" is with "+Account.bankName);
		System.out.println("Account balance is Rs.= "+balance);
		System.out.println("Interest rate applicable= "+iRate+" % ");
	}
	
	
	
	

	

	}


