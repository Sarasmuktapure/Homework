package com.Array;

import java.util.Scanner;

public class OddElement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	
		System.out.println("Odd elements are:");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		


	}

}
