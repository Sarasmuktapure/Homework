package com.Loop;
//given number and its reverse is same then palindrome otherwise not
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int copynum=num;
		int reverse=0;
		while(num>0)
		{
			int r=num%10;
			reverse=r+reverse*10;
			num=num/10;
		}
		System.out.println("Reverse of given number is:"+reverse);
		
		if(reverse==copynum)
		{
			System.out.println("Entered number is palindrome ");
		}
		else
		{
			System.out.println("Entered number is not palindrome ");
		}
		


	}

}
