package com.String;

import java.util.Scanner;

public class EvenPositionChar
{
	public static void evenPositionChar(String str)
	{
		System.out.println("Characters at even position are ");
		for(int i=1;i<str.length();i+=2)
		{
			char ch=str.charAt(i);
			System.out.println(ch);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		EvenPositionChar.evenPositionChar(str);
		

	}

}
