package com.Loop;
// to calculate 1!+2!+3!+4!+5!
public class SumofFactorialnumber {

	public static void main(String[] args) 
	{
		int sum=0;
		int fact=1;
		for(int i=1; i<=5; i++)
		{
			fact=fact*i;
			sum=sum+fact;
		}
		System.out.println(sum);

	}

}
