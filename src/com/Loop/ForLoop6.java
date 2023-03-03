package com.Loop;
// to find table of given number
import java.util.Scanner;
public class ForLoop6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		System.out.println("The Table of given number is:");
		
		for(int i=1; i<=10; i++)
		{
			
			int table=num*i;
			System.out.println(table+" ");
		   
		 }
	
		 
	}

}
