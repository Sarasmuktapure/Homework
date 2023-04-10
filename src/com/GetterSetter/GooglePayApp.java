package com.GetterSetter;

public class GooglePayApp 
{
	public void transferAmount(int amount,Account ac1)
	{
		System.out.println("Transaction in process.......");
		float bal=ac1.getBalance();
		ac1.setBalance(bal-amount);
		//ac1.setBalance(ac1.getBalance()-amount);
		System.out.println("Amount transfered successfully."+"\nUpdated balance of account no "+ac1.getAcno()+" is rs. "+ac1.getBalance());
		
		
	}

	public static void main(String[] args)
	{
		Account obj=new Account();
		obj.acceptAccountDetails(3253657, "Sonali", 50000f);
		GooglePayApp gp=new GooglePayApp();
		gp.transferAmount(5000, obj);
		

	}

}
