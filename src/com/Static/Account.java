package com.Static;
//Static variable
public class Account
{
	private int acno;
	protected String name;
	private float balance;
	
	public static String bankName="ICICI Bank";
	public static float iRate=7.2f;
	
	public static void changeInterestRate(float newRate)
	{
		iRate=newRate;
	}
	
	
	Account(){}
	Account(int a,String n,float b)
	{
		acno=a;
		name=n;
		balance=b;
    }
	void showAccountDetails()
	{
		System.out.println("Customer name is= "+name);
		System.out.println("Account number= "+acno+" is with "+Account.bankName);
		System.out.println("Account balance is Rs.= "+balance);
		System.out.println("Interest rate applicable= "+iRate+" % ");
	}

}
