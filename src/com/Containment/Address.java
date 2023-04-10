package com.Containment;

public class Address 
{
	int srvno,pin;
	String soci,city;
	
	public void getAddressDetails(int srvno, int pin, String soci, String city)
	{
		this.srvno=srvno;
		this.pin=pin;
		this.soci=soci;
		this.city=city;
	}
	
	public void showAddress()
	{
		System.out.println(srvno+","+pin+","+soci+","+city);
	}

	

}
