package com.Loop;
// sum of digit using for loop
import java.util.Scanner;
public class SumofdigitFor {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		for(; num>0; num=num/10)
		
		{
			int r=num%10;
			sum=sum+r;
		}
		System.out.println("The sum of digit of given number is:"+sum);

	}

}
