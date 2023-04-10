package com.Array;
//sum of each row and sum of each column in an array

import java.util.Arrays;

public class SumRowsColumn 
{
	public static void eachRowSum(int a[][])
	{
		System.out.println("Sum of each row elements are");
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.print("sum="+sum);
			System.out.println();
		}
	}
	
	public static void eachColumnSum(int a[][])
	{
		System.out.println("----------------------------------------------");
		System.out.println("Sum of each column elements are");
		for(int j=0;j<a.length;j++)
		{
			int sum=0;
			for(int i=0;i<a[j].length;i++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]+" ");
			}
			
			System.out.print("sum="+sum);
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int a[][]= {{2,3,4},{6,8,3},{1,9,4}};
	
		SumRowsColumn.eachRowSum(a);
		SumRowsColumn.eachColumnSum(a);
		

	}

}
