package com.Crud;

public class Bike
{
	private int bId;
	private String bName;
	private String bColour;
	private int price;
	
	public Bike(int bId, String bName, String bColour, int price) 
	{
		super();
		this.bId = bId;
		this.bName = bName;
		this.bColour=bColour;
		this.price = price;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbColour() {
		return bColour;
	}

	public void setbColour(String bColour) {
		this.bColour = bColour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Bike [bId="+ bId + ", bName=" + bName + ", bColour=" + bColour + ", price=" + price + "]";
	}
	
	

}
