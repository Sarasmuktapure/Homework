package com.Array;

import java.util.Scanner;

public class EvenPosition {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Even position elements are:");
		for(int i=1;i<a.length;i+=2)
		{
			System.out.println(a[i]);
		}

		

	}

}
