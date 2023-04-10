package com.String;

public class StringMethods
{
	public static void main(String[] args)
	{
		String s1="JAVA PROGRAM";
		String s2="software engineering";
		String s3="JAVA";
		
		String str1=s1.toLowerCase();// convert given upper letter string in to lower case letters
		System.out.println(str1);
		
		String str2=s2.toUpperCase();
		System.out.println(str2);
		
		String str3=s1.concat(" "+s2);
		System.out.println(str3);
		
		System.out.println(s1.contains(s3));//check s3 contains in s1 or not
	}

}
