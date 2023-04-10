package com.Loop;
// average of digit in a given number
import java.util.Scanner;
public class AverageofDigit {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;
			count++;
		}
		
		int avg=sum/count;
		
		System.out.println("Sum of digits are:"+sum);
		System.out.println("Average of digits are:"+avg);
		
		
	}

}
