package com.AccessSpecifier;

public class AccessDemo {

	public static void main(String[] args)
	{
		AccountDemo ac=new AccountDemo();
		ac.openAccount();
		ac.showAccDetails();
		//ac.fillCustDetails(126868,"Divya",35000f);
		
	}

}
//main method outside the class 
//here I am not able to access private method fillCustDetails