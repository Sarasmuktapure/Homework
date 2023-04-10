package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CharSort
{
	public static void main(String[] args) 
	{
		char[]ch= {'a','B','k','P','w','R'};
		//Arrays.sort(ch);
		//for(int i=0;i<ch.length;i++)
		//{
			//System.out.println(ch[i]);
		
			for(int i=0;i<ch.length;i++)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]>ch[j])
					{
						char temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
					}
				}
			}
			System.out.println(Arrays.toString(ch));
		}
	
		
	
}
