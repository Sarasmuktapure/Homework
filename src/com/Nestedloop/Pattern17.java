package com.Nestedloop;

public class Pattern17 {

	public static void main(String[] args) 
	{
		for(char i='D'; i>='A'; i--)
		{
			for(char j='A'; j<=i; j++)
			{
				//System.out.print(i);
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
