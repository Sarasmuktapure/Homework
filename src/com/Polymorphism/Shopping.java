package com.Polymorphism;

public class Shopping
{
	public void doTransaction(CreditCard c)
	{
		c.useCard();
	}
	public void doTransaction(DebitCard d)
	{
		d.useCard();
	}
	

	public static void main(String[] args)
	{
		Shopping s=new Shopping();
		CreditCard cc=new CreditCard();
		DebitCard dc=new DebitCard();
		
		s.doTransaction(cc);
		s.doTransaction(dc);
		
	}

}
