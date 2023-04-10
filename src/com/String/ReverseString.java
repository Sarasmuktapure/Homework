package com.String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String revstring=" ";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			revstring=ch+revstring;
				
		}
			System.out.println(revstring);
		
		
	}

}
