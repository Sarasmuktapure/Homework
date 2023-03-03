package com.Switch;
//to check given character is vowel or consonant using switch case
import java.util.Scanner;
public class SwitchAlphabet {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a':System.out.println("it is a vowel");
		break;
		case 'e':System.out.println("it is a vowel");
		break;
		case 'i':System.out.println("it is a vowel");
		break;
		case 'o':System.out.println("it is a vowel");
		break;
		case 'u':System.out.println("it is a vowel");
		break;
		
		case 'A':System.out.println("it is a vowel");
		break;
		case 'E':System.out.println("it is a vowel");
		break;
		case 'I':System.out.println("it is a vowel");
		break;
		case 'O':System.out.println("it is a vowel");
		break;
		case 'U':System.out.println("it is a vowel");
		break;
		
		default:System.out.println("it is not a vowel");
		
		
		
	
		}
		


	}

}
