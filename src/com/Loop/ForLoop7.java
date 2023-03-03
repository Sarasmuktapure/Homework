package com.Loop;
// display number between 1 to 20 skip which are divisible by 3
public class ForLoop7 {

	public static void main(String[] args)
	{
		for(int i=1; i<=20; i++)
		{
			if(i%3==0)
			{
				continue;
			}
			else
				{
					System.out.println(i);
				}
			}
		}

	}


