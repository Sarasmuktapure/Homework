package com.Loop;
// print table of 1 to 5 as per user choice
import java.util.Scanner;
public class TableOf_1to5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number choice to print table from below menu:");
	    System.out.println(" 1.Table of 1\n 2.Table of 2\n 3.Table of 3\n 4.Table of 4\n 5.Table of 5");
		int num=sc.nextInt();
		
		System.out.println("The table of given number is:");
		
		for(int i=1; i<=10; i++)
		{
			
			
			int table=num*i;
			System.out.println(table);
		   
		 }
				
	}

}
