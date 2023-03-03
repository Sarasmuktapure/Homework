package com.Loop;
import java.util.Scanner;
public class DisariumNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int copynum=num;
		
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
		num=copynum;
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			int power=1;
			for(int i=1; i<=count; i++)
			{
				power=power*r;
				
			}
		
			sum=sum+power;
			count--;
			num=num/10;
		
			
			
		}	System.out.println(sum);
			
			
		if(copynum==sum)
		{
			System.out.println("It is disarium number");
		}
		else
		{
			System.out.println("It is not disarium number");
		}

	}

}
