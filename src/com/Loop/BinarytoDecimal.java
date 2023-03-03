package com.Loop;
import java.util.Scanner;
public class BinarytoDecimal {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sum=0;int p=0;int m;
		while(num>0)
		{
			int digit=num%10;
			//m=(int)(digit*(Math.pow(2, p)));
			int power=1;
			for(int i=1;i<=p;i++)
			{
				power=power*2;
				
			}
			m=digit*power;
			sum=sum+m;
			p++;
			num=num/10;
			
		}
		System.out.println(sum);

	}

}
