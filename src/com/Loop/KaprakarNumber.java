package com.Loop;
import java.util.Scanner;
public class KaprakarNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		int copynum=num;
		int n=num*num;
		
		while(n>0)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		if(sum==copynum)
		{
			System.out.println("It is kaprakar Number");
		}
		else
		{
			System.out.println("It is  not kaprakar Number");
		}

	}

}//this is for single digit number
