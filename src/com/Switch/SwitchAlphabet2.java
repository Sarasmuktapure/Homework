package com.Switch;
//to check vowel or consonant or not an alphabet using switch and if 
import java.util.Scanner;
public class SwitchAlphabet2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			switch(ch)
			{
			   case 'a':
			   case 'e':
			   case 'i':
			   case 'o':
			   case 'u':
				   
			   case 'A':
			   case 'E':
			   case 'I':
			   case 'O':
			   case 'U':
				  
			   System.out.println("Entered character is vowel");
			   break;
			   default:System.out.println("Entered character is consonant");
				
			}
		}
			else
			{
				System.out.println("Entered character is not an alphabet");
			}
			
		}

	}


