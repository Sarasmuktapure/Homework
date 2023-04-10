package com.Abstraction;

abstract class ObjectMovement
{
	int speed;
	static String direction="Forword";
	abstract public void move(int newSpeed);
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public int getSpeed()
	{
		return speed;
	}
}
class Ball extends ObjectMovement
{

	@Override
	public void move(int s)
	{
		speed=s;
		System.out.println("Ball is rolling with speed "+speed+"m/min on the ground in "+ObjectMovement.direction+" dirction");
		
	}
	public void showColour()
	{
		System.out.println("Ball is red");
	}
	
}
class Car extends ObjectMovement
{

	@Override
	public void move(int s) 
	{
		speed=s;
		System.out.println("Car is running with speed "+speed+"Km/hr on the road in "+ObjectMovement.direction+" direction");
	}
	public void showColour()
	{
		System.out.println("Car is blue");
	}
	
	
}
public class AbstractClassDemo 
{
	public static void main(String[] args)
	{
		ObjectMovement om=new Car();
		om.setSpeed(120);
		System.out.println("Initial speed of car: "+om.getSpeed()+"km/hr");
		om.move(80);
		
		om=new Ball();
		om.setSpeed(20);
		System.out.println("Initial speed of ball is: "+om.getSpeed()+"km/hr");
		om.move(12);
		
		

	}

}
