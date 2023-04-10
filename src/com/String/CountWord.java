package com.String;

import java.util.Scanner;

public class CountWord 
{
	public static void countWord(String str)
	{
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Total number of words from given string are= "+count);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		CountWord.countWord(str);
		
		

	}

}
