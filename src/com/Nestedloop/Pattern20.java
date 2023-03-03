package com.Nestedloop;
public class Pattern20 {
public static void main(String[] args)
	{
		
		for(int i=1; i<=4; i++)
		{
			int alpha='A';
			for(int j=1; j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print((char)alpha++ );
				}
				else
				{
					System.out.print(j );
				}
			}
			
			System.out.println();
		}

	}

}
