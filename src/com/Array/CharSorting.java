package com.Array;
//Descending sorting of character
import java.util.Arrays;
import java.util.Scanner;

public class CharSorting
{
	public static void charSort(char[]ch)
	{
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
		
		System.out.println("Sorted array is");
		CharSorting.charSort(ch);
		
		System.out.println(Arrays.toString(ch));
		

	}

}
