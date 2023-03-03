package com.Loop;
import java.util.Scanner;
public class KrishnamurthiNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");

		int num=sc.nextInt();
		int copynum=num;
		int sum=0;
		
		while(num>0)
		{
			int digit=num%10;
			int fact=1;
			for(int i=1; i<=digit; i++)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
			num=num/10;
			
		}
		if(copynum==sum)
		{
			System.out.println("It is krishnmurthi number");
		}
		else
		{
			System.out.println("It is not krishnmurthi number");

		}

	}

}
