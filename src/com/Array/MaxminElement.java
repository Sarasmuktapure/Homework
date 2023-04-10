package com.Array;

import java.util.Scanner;

public class MaxminElement {

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
	
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Maximum element from an array is="+max);
		System.out.println("Minimum element from an array is="+min);
		

	}

}
