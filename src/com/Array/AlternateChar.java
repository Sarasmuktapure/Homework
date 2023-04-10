package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateChar
{
	public static void altChar(char[]ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='Y'&&ch[i]!='y'&&ch[i]!='Z'&&ch[i]!='z')
			{
			char c=ch[i];
	        int ascii=c+2;
			char altc=(char)ascii;
			System.out.println(altc);
			}
			else if (ch[i]=='Y')
			{
				System.out.println(ch[i]='A');
			}
			else if(ch[i]=='y')
			{
			System.out.println(ch[i]='a');
			}
			else if(ch[i]=='Z')
			{
				System.out.println(ch[i]='B');
			}
			else if(ch[i]=='z')
		    {
				System.out.println(ch[i]='b');
			}
			
			
			
			
			
		}
	
		
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		char[]ch=new char[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			char c=sc.next().charAt(0);
			ch[i]=c;
			
		}
		
		System.out.println("Alternate elements are");
		//CharSorting.charSort(ch);
		
	
		AlternateChar.altChar(ch);
		//System.out.println(Arrays.toString(ch));
		

	}

	



	

}
