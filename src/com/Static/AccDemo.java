package com.Static;
//to initialize static variables in static block
public class AccDemo
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
	
	public static void changeInterestRate(float newRate)
	{
		iRate=newRate;
		System.out.println("Static method invoked from static block also");
	}
	
	
	AccDemo(){}
	AccDemo(int a,String n,float b)
	{
		acno=a;
		name=n;
		balance=b;
    }
	
	static
	{
		System.out.println("static block2 executed");
		iRate=7.9f;
		changeInterestRate(6.5f);
	}
	
	
	void showAccountDetails()
	{
		System.out.println("Customer name is= "+name);
		System.out.println("Account number= "+acno+" is with "+Account.bankName);
		System.out.println("Account balance is Rs.= "+balance);
		System.out.println("Interest rate applicable= "+iRate+" % ");
	}

}
