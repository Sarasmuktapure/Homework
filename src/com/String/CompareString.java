package com.String;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String str1=sc.nextLine();
		System.out.println("Enter the 2nd string");
		String str2=sc.nextLine();
		int length1=str1.length();
		int length2=str2.length();
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		int flag=1;
		if(length1==length2)
		{
			for(int i=0;i<length1;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					flag=0;
					break;
				}
			}
		}
		else
		{
			flag=0;
		}
		if (flag==1)
		{
			System.out.println("Two strings are equal......!");
			System.out.println(str1+"="+str2);
		}
		else
		{
			System.out.println("Two strings are not equal");
		}
	}

}
