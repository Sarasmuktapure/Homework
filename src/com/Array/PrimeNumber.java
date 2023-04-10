package com.Array;

import java.util.Scanner;

public class PrimeNumber
{
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if((n%i)==0)
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The prime numbers are");
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[i]))
			{
				System.out.println(a[i]);
			}
		}
		
		

	}

}
