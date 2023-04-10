package com.String;

import java.util.Scanner;

public class MinMaxCharacter {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int freq[]=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ' && ch[i]!=0)
				{
					freq[i]++;
					ch[j]='\0';
				}
			}
			
		}
		int min=freq[0];
		int max=freq[0];
		char minchar=ch[0];
		char maxchar=ch[0];
		
		for(int i=0;i<freq.length;i++)
		{
			if(min>freq[i])
			{
				min=freq[i];
				minchar=ch[i];
			}
			
			else if(max<freq[i])
			{
				max=freq[i];
				maxchar=ch[i];
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			for(int j=i+1;j<freq.length;j++)
			{
			 if(freq[i]==freq[j])
			{
			 if(ch[i]<ch[j])
			 {
				 char temp=ch[i];
				 ch[i]=ch[j];
				 ch[j]=temp;
			 }
			 System.out.println(ch[i]);
			}
			
				
			}
		}
		System.out.println("Minimum occurring character is:"+minchar);
		System.out.println("Maximum occurring character is:"+maxchar);

	}

}
