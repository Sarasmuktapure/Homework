package com.Array;

public class MaxRowsColumn 
{
	public static void eachColsMax(int a[][])
	{
		for(int x[]:a)
		{
			for(int val:x)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
		System.out.println("Max element from each column");
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[j][i]>max)
				{
					max=a[j][i];
				}
			}
			System.out.print(max+" ");
			System.out.println();
		}
		
	}
	
	
	public static void eachRowMax(int a[][])
	{
		System.out.println("----------------------------------------------------");
		System.out.println("Max element from each row");
		for(int i=0;i<a.length;i++)
		{
			int max=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.print(max+" ");
			System.out.println();
		}
		
		
	}
	
	

	public static void main(String[] args)
	{
		int a[][]= {{5,6,7},{3,9,8},{2,2,7}};
		MaxRowsColumn.eachColsMax(a);
		MaxRowsColumn.eachRowMax(a);

	}

}
