package com.Loop;
// to calculate power of number using for loop
import java.util.Scanner;
public class ForLoop9 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int b=sc.nextInt();
		
		System.out.println("Enter the exponent");
		int expo=sc.nextInt();
		
		int power=1;
		for(int i=1; i<=expo; i++)
		{
			power=power*b;
		}
		System.out.println("The power is:"+power);
		
		
		
		

	}

}
