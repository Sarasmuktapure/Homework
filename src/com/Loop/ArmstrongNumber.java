package com.Loop;
// check armstrong number or not using 3 digit in that sum of cube of each digit is same as original no. then it is armstrong
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int copynum=num;
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			sum=r*r*r+sum;//cube of digit's sum
		    num=num/10;
		}
		if(copynum==sum)
		{
			System.out.println("It is armstrong number");
		}
		else
		{
			System.out.println("It is not armstrong number");
		}

	}
		

}
