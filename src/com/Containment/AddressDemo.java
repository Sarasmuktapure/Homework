package com.Containment;

public class AddressDemo
{
	int srvno,pin;
	String soci,city;
	
	
	public int getSrvno() {
		return srvno;
	}

	public void setSrvno(int srvno) {
		this.srvno = srvno;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getSoci() {
		return soci;
	}

	public void setSoci(String soci) {
		this.soci = soci;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public AddressDemo(int srvno, int pin, String soci, String city)
	{
		System.out.println("Welcome to adrress constructor");
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
