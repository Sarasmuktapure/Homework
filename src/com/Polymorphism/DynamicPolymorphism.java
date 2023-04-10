package com.Polymorphism;

class Vehicle
{
	public void move()
	{
		System.out.println("Vehicle is moving");
	}
}
class Car extends Vehicle
{
	public void move()
	{
		System.out.println("Car is moving horizontally on road");
	}
	
}
class Helicopter extends Vehicle
{
	public void move()
	{
		System.out.println("Helicopter is moving vertically up in the sky");
	}
}

public class DynamicPolymorphism {

	public static void main(String[] args) 
	{
		Vehicle v=new Car();//this dynamic type will decide which move method will call 
		//and this dynamic type context is created at the time of execution and move method will get linked to that object at the time of execution very late  
		//so it is called late binding or dynamic binding
		v.move();
		
		v=new Helicopter();
		v.move();
		
		
	}

}
