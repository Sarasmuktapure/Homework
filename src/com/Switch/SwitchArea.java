package com.Switch;
// to find area of rectangle,square,circle,triangle as per the user choice
import java.util.Scanner;
public class SwitchArea {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operation from following menu");
		System.out.println(" 1.Area of square\n 2.Area of rectangle\n 3.Area of triangle\n 4.Area of circle");
		
		int num=sc.nextInt();
		switch(num)
		{
		case 1:System.out.println("Enter the side of square");
		       int s=sc.nextInt();
		       int areas=s*s;
		       System.out.println("Area of square is="+areas);
		break;
		
		case 2:System.out.println("Enter the length and width of rectangle");
		       int l=sc.nextInt();
		       int w=sc.nextInt();
               int arear=l*w;
		       System.out.println("Area of rectangle is="+arear);
		break;
		
		case 3:System.out.println("Enter the height and base of triangle ");
		       int b=sc.nextInt();
		       int h=sc.nextInt();
		       int areat=(b*h)/2;
		       System.out.println("Area of triangle is="+areat);
		break;
		
		case 4:System.out.println("Enter the radius of circle ");
		       float r=sc.nextFloat();
		       float pi=22/7;
		       float areac=pi*r*r;
		       System.out.println("Area of circle is="+areac);
		break;       
		       

		}

	}

}
