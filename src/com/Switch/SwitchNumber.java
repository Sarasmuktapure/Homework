package com.Switch;
//take no. from 1 to 5 from user and display in a word
import java.util.Scanner;
public class SwitchNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		switch(num)
		{
		case 1:System.out.println("one");
		break;
		
		case 2:System.out.println("two");
		break;
		
		case 3:System.out.println("three");
		break;
		
		case 4:System.out.println("four");
		break;
		
		case 5:System.out.println("five");
		break;
		
		}
		

	}


}
