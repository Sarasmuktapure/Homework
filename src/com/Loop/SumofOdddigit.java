package com.Loop;
// sum of all odd digit from the given number
import java.util.Scanner;
public class SumofOdddigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Odd digits are:");
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			if(r%2==1)
			{
				sum=sum+r;
				System.out.println(r);
				
			}
			
			num=num/10;
		}
		
		System.out.println("Sum of odd digits are:"+sum);
	}

}
