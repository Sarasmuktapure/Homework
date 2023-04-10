package com.Array;
// we can override the overloaded method


 class MultiplicationTest{
	 public void multiplication(int num1, int num2)
	 {
		 System.out.println(num1*num2);
	 }
	 public void multiplication(int num1,int num2,int num3)
	 {
		 System.out.println(num1*num2*num3);
	 }
 }
public class Override extends MultiplicationTest 
{
	public void multiplication(int num1,int num2)
	{
		System.out.println("Overriden Method from parent class");
		 System.out.println(num1*num2);
	}
	
		
	public static void main(String[] args)
	{
		MultiplicationTest mt=new MultiplicationTest();
		mt.multiplication(5, 7);
		mt.multiplication(8, 5, 2);
		Override o=new Override();
		o.multiplication(3, 9);
	

	}

}
