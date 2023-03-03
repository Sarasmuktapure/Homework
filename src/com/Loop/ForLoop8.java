package com.Loop;
// display number 1 to 20 and stops which are divisible by 3 and 9 both
public class ForLoop8 {

	public static void main(String[] args) 
	{
		for(int i=1; i<=20; i++)
		{
			if(i%3==0 && i%9==0)
			{
				continue;
			}
			System.out.println(i);
			
		}

	}

}
