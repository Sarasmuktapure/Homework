package com.Loop;
// sum of prime number between 1 to 10
public class SumofPrimenumber {

	public static void main(String[] args)
	{
		System.out.println("The prime numbers are:");
		int sum=0;
         for(int num=1; num<=10; num++)
			
		{
        	 
			boolean isprime=true;
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime==true)
			{
				System.out.println(num);
				sum=sum+num;
			}
			
		}
         System.out.println("The sum is:"+sum);
        
	}

}
