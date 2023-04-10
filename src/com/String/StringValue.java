package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class StringValue 
{
	public static void checkValue(String str,char ch)
	{
		//String word[]=str.split("+");
		//System.out.println(word);
		//char cr[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				System.out.println(ch+" Same with "+str.charAt(i));
				
			}	
		}
		
		char cr[]=str.toCharArray();
		System.out.println(Arrays.toString(cr));
		//String []word=str.split("+");
		
		//for(String sr:word)
		//{
			//System.out.println(sr);
			
		//}
		
				
				
				//System.out.println(str.charAt(i));
					//int digit=Character.getNumericValue(str.charAt(i));
					//System.out.println(digit);
			}
		
	
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		StringValue.checkValue(s, ch);
		
		
	}
}
