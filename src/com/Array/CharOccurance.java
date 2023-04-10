package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CharOccurance
{
	public static void charOccur(char[]ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(ch[i]==ch[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
					}
				}
				System.out.println(ch[i]+" "+count);
			}
		
		}
		
		}
	

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		char[]ch=new char[size];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			char c=sc.next().charAt(0);
			ch[i]=c;
		}
		
		CharOccurance.charOccur(ch);
		//System.out.println(Arrays.toString(ch));
		
     }

}


