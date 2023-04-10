package com.Abstract;

interface Printable
{
	int a=54;
}

abstract class Operation 
{
   int b=65;
}

class PerformOp extends Operation implements Printable{
	public void add()
	{
		System.out.println("Addition is="+(a+b));
	}
}

public class Addition {

	public static void main(String[] args)
	{
		PerformOp p=new PerformOp();
		System.out.println("First number is="+p.a);
		System.out.println("Second number is="+p.b);
		
		p.add();
	}

}
