package com.Nestedloop;

public class Pattern7 {
	public static void main(String[] args)
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
	}

}
