package com.Polymorphism;

class DebitCard
{
	public void useCard()
	{
		System.out.println("No discount on bill on debit card transaction");
	}
	
}
public class CreditCard
{
	public void useCard()
	{
		System.out.println("You got 15% discount on bill on credit card transaction");
	}

}
