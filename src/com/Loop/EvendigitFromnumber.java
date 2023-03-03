package com.Loop;
// find even digit from the given number
import java.util.Scanner;
public class EvendigitFromnumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Even digits are:");
		
		while(num>0)
		{
			int r=num%10;
			if(r%2==0)
			{
				System.out.println(r);
			}
		
			num=num/10;
		}

	}

}
