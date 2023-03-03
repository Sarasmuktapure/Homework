package com.Loop;
// check prime number using for loop
import java.util.Scanner;
public class CheckprimeFor {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		boolean isprime=true;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
		}
		
		if(num<=1)
		{
			System.out.println("Entered number is not prime");
			return;
		}
		
		if(isprime==true)
		{
			System.out.println("Entered number is prime");
		}
		else
		{
			System.out.println("Entered number is not prime");
		}

	}

}
