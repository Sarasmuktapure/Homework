package com.String;

import java.util.Scanner;

public class VowelConsonant 
{
	public static void countVoewlsConsonants(char ch[])
	{
		int vowel=0;
		int conso=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				vowel++;
			}
			else if(ch[i]!=' ')
			{
				conso++;
			}
		}
		System.out.println("Total number of vowels are="+vowel);
		System.out.println("Total number of consonants are="+conso);
		
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		VowelConsonant.countVoewlsConsonants(ch);
		
		
		
		

	}

}
