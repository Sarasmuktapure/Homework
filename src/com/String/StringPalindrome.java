package com.String;

import java.util.Scanner;

public class StringPalindrome 
{
	public static void checkPalindrome(String s)
	{
		String str=s.toLowerCase();
		String revstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		System.out.println(revstr);
		if(str.compareTo(revstr)==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		StringPalindrome.checkPalindrome(s);
		
}

}
