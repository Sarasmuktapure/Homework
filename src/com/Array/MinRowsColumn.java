package com.Array;

public class MinRowsColumn {
	public static void eachColsMin(int a[][])
	{
		for(int x[]:a)
		{
			for(int val:x)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
		System.out.println("Min element from each column");
		for(int i=0;i<a.length;i++)
		{
			int min=a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[j][i]<min)
				{
					min=a[j][i];
				}
			}
			System.out.print(min+" ");
			System.out.println();
		}
		
	}
	
	
	public static void eachRowMin(int a[][])
	{
		System.out.println("----------------------------------------------------");
		System.out.println("Min element from each row");
		for(int i=0;i<a.length;i++)
		{
			int min=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
			System.out.print(min+" ");
			System.out.println();
		}
		
		
	}
	
	

	public static void main(String[] args)
	{
		int a[][]= {{5,6,7},{3,9,8},{2,2,7}};
		MinRowsColumn.eachColsMin(a);
		MinRowsColumn.eachRowMin(a);
		

	}

}
