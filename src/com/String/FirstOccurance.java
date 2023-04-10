package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurance 
{
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
    	int count=0;
		int i;
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("Enter the character to find first character occurance");
		char ch=sc.next().charAt(0);
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Character not found");
		}
		else
		{
			System.out.println("The first character occurance of "+ch+ " is at "+i+" position");
		}
	}

}
