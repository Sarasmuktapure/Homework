package com.Loop;
import java.util.Scanner;
public class AtomorphicNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		int copynum=num;
		int n=num*num;
		int count=0;
		
		while(num>0)
		{
			count++;
		
			num=num/10;
		}
		System.out.println(count);
		
		num=copynum;
		int power=1;
		
		for(int i=1; i<=count; i++)
		{
			power=power*10;
		}
		System.out.println(power);
            int end=n%power;
			System.out.println(end);
		  
			if(copynum==end)
		{
			System.out.println("It is atomorphic number");
			
		}
		else
		{
			System.out.println("It is not atomorphic number");
			
		}
		

	}

	}

