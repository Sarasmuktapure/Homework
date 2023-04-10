package com.String;

import java.util.Scanner;

public class AverageDigit
{
	public static void avgDigit(String str)
	{
		float count=0;
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
				sum=sum+Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println("Average is= "+(sum/count));
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		AverageDigit.avgDigit(str);

		
	}

}
