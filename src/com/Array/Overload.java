package com.Array;
// we can overload the overridden methods
class Person{
	public void addition(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
}
public class Overload extends Person
{
	public void addition(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	public void addition(int num1,double num2)
	{
		System.out.println(num1+num2);
	}

	public static void main(String[] args)
	{
		Person p=new Person();
		p.addition(8, 9);
		Overload o=new Overload();
		o.addition(18, 15.0);
		o.addition(81, 9);

	}

}
