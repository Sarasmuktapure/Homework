package com.Array;

//Sum of array element
import java.util.Scanner;
public class ArrayElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println("Sum="+sum);


	}

}
