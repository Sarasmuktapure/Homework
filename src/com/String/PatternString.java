package com.String;

import java.util.Scanner;

public class PatternString 
{
	public static void stringPatter(String s)
	{
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str[j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		PatternString.stringPatter(s);
		
	}

}
