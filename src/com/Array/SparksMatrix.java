package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SparksMatrix
{
	
	public static void checkSparks(int a[][])
	{
		int count=0;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				
				if((a[i][j])==0)
				{
					count++;
				}
				else if(a[i][j]!=0)
				{
					temp++;
				}
			}
		}	
		if(count==temp)
		{
			System.out.println("Array has equal non-zero and zero elements");
		}
		else if(count>temp)
		{
			System.out.println("Array is sparks matrix");
		}
		else if(count<temp)
		{
			System.out.println("Array is not sparks matrix");
		}
		
		
				
				
		}
	

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row=sc.nextInt();
		System.out.println("Enter the size of column");
		int colm=sc.nextInt();
		System.out.println("Enter the array elements");
		int a[][]=new int [row][colm];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		SparksMatrix.checkSparks(a);
		
		
					
				
				
			}
			
		
		
		
		

	}


