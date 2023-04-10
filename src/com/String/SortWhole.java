package com.String;
//sort string words in descending order
import java.util.Arrays;
import java.util.Scanner;

public class SortWhole
{
	
	public static void wholeSort(String str)
	{
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])<0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}
	public static void sortString(String str)
	{
		char ch[]=str.toCharArray();
		
			for(int i=0;i<ch.length;i++)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]<ch[j])
					{
						char temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
					}
				}
				
			}
			System.out.println(Arrays.toString(ch));
			
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		SortWhole.wholeSort(str);
		System.out.println("---------------------------------");
		SortWhole.sortString(str);
		
		
	
	}

}
