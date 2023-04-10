package com.Array;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) 
	{
		int []a={4,9,3,6};
		int[]b= {1,7,5,8};
		int length=a.length+b.length;
		int[]m=new int[length];
		int pos=0;
		
		for(int i=0;i<a.length;i++)
		{
			m[pos]=a[i];
			pos++;
		}
		for(int i=0;i<b.length;i++)
		{

			m[pos]=b[i];
			pos++;
		}
		System.out.println(Arrays.toString(m));

	}

}
