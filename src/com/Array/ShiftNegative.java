package com.Array;

import java.util.Arrays;

public class ShiftNegative
{
	public static void shiftNegative(int []a)
	{
		int j,temp;
		for(int i=0;i<a.length;i++)
		{
			j=i;
			while((j>0)&&(a[j]>0)&&(a[j-1]<0))
			{
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				j--;
			}
			
		}
		System.out.println(Arrays.toString(a));

		
		
	}

	public static void main(String[] args)
	{
		int[]a= {4,7,-4,-7,8,-5};
		//ShiftElements.shiftZeros(a);
		ShiftNegative.shiftNegative(a);
		//System.out.println(Arrays.toString(a));
		


	}

}
