package com.Loop;
// count how many odd numbers between 1 to 10
public class ForLoop5 {

	public static void main(String[] args)
	{
		System.out.println("The odd numbers are:");

		int count=0;
		for(int i=1; i<=10; i++)
		{
			if(i%2==1)
			{
				System.out.println(i+" ");
				count++;
				
			}
			
			
		}
		System.out.println("The count of odd numbers are:");
		System.out.println(count);
	}
}


	


