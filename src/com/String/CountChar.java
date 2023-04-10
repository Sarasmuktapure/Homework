package com.String;

import java.util.Scanner;

public class CountChar
{
	public static void countChar(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total number of characters from given string are="+count);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		CountChar.countChar(str);
		
		

	}

}
