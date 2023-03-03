package com.Nestedloop;

public class Pattern16 {

	public static void main(String[] args)
	{
		for(char i='A'; i<='D'; i++)
		{
			for(char j='D'; j>=i; j--)
			{
				//System.out.print(i);
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
