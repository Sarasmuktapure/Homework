package com.Access;
//here import package where account class exists
import com.AccessSpecifier.AccountDemo;
public class AccessAccountDetails {

	public static void main(String[] args) 
	{
		AccountDemo ad=new AccountDemo();
		ad.openAccount();
		//here I am able to access only public method
		
		

	}

}
