package com.Abstract;

abstract class Vehical{
	abstract void showVehical();
}

abstract class Truck extends Vehical{
	abstract void showTruck();
}

class Bus extends Truck{
	public void showVehical()
	{
		System.out.println("It is a Vehical");
	}
	public void showTruck()
	{
		System.out.println("It is a Truck");
	}
}

public class AbstractTest {

	public static void main(String[] args) 
	{
		Bus b=new Bus();
		b.showVehical();
		b.showTruck();
	}

}
