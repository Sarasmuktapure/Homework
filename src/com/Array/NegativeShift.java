package com.Array;

import java.util.Arrays;

public class NegativeShift
{
	public static void negativeShift(int[]a,int n)
	{
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>=0)
			{
				temp[j]=a[i];
				j++;
			}
		}
			
			
			for(int i=0;i<n;i++)
			{
				if(a[i]<0)
				{
					temp[j]=a[i];
					j++;
				}
			}
			for(int i=0;i<n;i++)
			{
				a[i]=temp[i];
			
			}
	}
	

	public static void main(String[] args)
	{
		int a[]= {4,-8,5,-9,-6,3,-2};
		int n=a.length;
		NegativeShift.negativeShift(a, n);
		
		
			//System.out.println(a[i]);
		
		System.out.println(Arrays.toString(a));
		

	}

}
