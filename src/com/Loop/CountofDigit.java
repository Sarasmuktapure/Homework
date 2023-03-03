package com.Loop;
// to count number of digit in given number
import java.util.Scanner;
public class CountofDigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int count=0;
		while(num>0)
		{
			int r=num%10;
			count++;
			num=num/10;
		}
		System.out.println("Total number of digit in given number is:"+count);
		

	}

}
