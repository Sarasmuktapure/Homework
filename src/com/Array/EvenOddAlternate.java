package com.Array;

import java.util.Scanner;

public class EvenOddAlternate 
{
	

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
		int evensize=0;
		int oddsize=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evensize++;
			}
			else
			{
				oddsize++;
			}
		}
		int even[]=new int[evensize];
		int odd[]=new int[oddsize];
		int e=0, o=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[e]=a[i];
				e++;
			}
			else if(a[i]%2!=0)
			{
				odd[o]=a[i];
				o++;
			}
		}
		int b[]=new int[size];
		int pos=0;
		int i=0,j=0;
		for( i=0;i<evensize;i++)
		{
			for(j=0;j<oddsize;j++)
			{
			b[pos++]=even[i];
			//pos++;
			b[pos++]=odd[i];
			//pos++;
		}
		}
		for( i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	

	}

}
