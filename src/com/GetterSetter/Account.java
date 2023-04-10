package com.GetterSetter;

public class Account
{
	private int acno;
	private String name;
	private float balance;
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void acceptAccountDetails(int acno,String name,float balance)
	{
		this.acno=acno;
		this.name=name;
		this.balance=balance;
	}
	
}


