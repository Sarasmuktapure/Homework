package com.Array;

import java.util.Scanner;

public class DemoAdd2d {

	public static void main(String[] args)
	{
		//int a[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of rows for array1");
		int rowsa=sc.nextInt();
		System.out.println("Enter the size of column for array1");
		int colma=sc.nextInt();
		int [][]a=new int[rowsa][colma];
		
		System.out.println("Enter the array 1 elements");
		//Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Array 1 is");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("______________________________________________");
		
		//int b[][]=new int[2][2];
		
		System.out.println("Enter the size of rows for array2");
		int rowsb=sc.nextInt();
		System.out.println("Enter the size of column for array2");
		int colmb=sc.nextInt();
		int [][]b=new int[rowsb][colmb];
		
		System.out.println("Enter the array 2 elements");
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Array 2 is");
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}	
		System.out.println("______________________________________________");
		
		int rowsc=rowsa+rowsb;
		int colmc=colma+colmb;
		
		System.out.println("Addition of these two array elements in array 3 is");
		int c[][]=new int[rowsc][colmc];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			   c[i][j]=a[i][j]+b[i][j];
			   System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


}
}
