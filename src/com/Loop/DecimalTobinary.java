package com.Loop;
// decimal to binary 
import java.util.Scanner;
public class DecimalTobinary {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int r=0;
		while(num>0)
		{
			 r=num%2;
			num=num/2;
		
			System.out.print(r);			
			
			
			
		}
		
	
		
		System.out.println();
		
		
		
	}

}

