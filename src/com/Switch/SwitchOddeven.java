package com.Switch;
// to check no. is odd or even using switch case
import java.util.Scanner;
public class SwitchOddeven {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		switch(num%2)
		{
		case 0:System.out.println("Entered number is even");
		break;
		
		case 1:System.out.println("Entered number is odd");
		break;
		}

	}

}
