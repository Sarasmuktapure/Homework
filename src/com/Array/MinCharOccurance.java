package com.Array;

import java.util.Scanner;

public class MinCharOccurance
{
	public static void charOccur(char[]ch)
	{
		int freq[]=new int[ch.length];
		char newch[]=new char[ch.length];
		int x=0;
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(ch[i]==ch[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						
					}
				}
				 newch[x]=ch[i];
				 freq[x]=count;
				 x++;
			}
		}
		int max=freq[0];
		int min=freq[0];
		char minchar=newch[0];
		char maxchar=newch[0];
		for(int j=1;j<x;j++)
		{
			if(freq[j]<min)
			{
				min=freq[j];
				minchar=newch[j];
			}
			if(freq[j]>max)
			{
				max=freq[j];
				maxchar=newch[j];
			}
		}
		System.out.println("Minimum occurance character is="+minchar);
		System.out.println("Maximum occurance character is="+maxchar);
}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		char[]ch=new char[size];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			char c=sc.next().charAt(0);
			ch[i]=c;
		}
		
		MinCharOccurance.charOccur(ch);
		

	}

}
