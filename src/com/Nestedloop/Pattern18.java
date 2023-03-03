package com.Nestedloop;
import java.util.Scanner;
public class Pattern18 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int num=sc.nextInt();
		int alpha=65;
		
		for(int i=0; i<num; i++)
		{
			for(int j=0; j<num; j++)
			{
				if(i==0 || i==num-1)
				{
					System.out.print((char )(alpha+j));
				}
				else if(j==0 || j==num-1)
				{
					System.out.print((char )(alpha+j));

				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
				
		
		

	}

}
