package com.Static;

public class Bank {

	public static void main(String[] args) 
	{
		Account acc1=new Account(345657,"Mr. Aditya",150900f);
		Account acc2=new Account(978675,"Mr. Manoj",150000f);
		acc1.showAccountDetails();
		System.out.println("---------------------------------------------");
		acc2.showAccountDetails();
		System.out.println("__________________________________________________");
		Account.changeInterestRate(7.5f);
		acc1.showAccountDetails();
		System.out.println("----------------------------------------------");
		acc2.showAccountDetails();
		
	}

}
