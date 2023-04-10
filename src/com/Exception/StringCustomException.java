package com.Exception;

class StringValidateException extends Exception{
	public StringValidateException ()
	{
		System.out.println("Invalid String");
	}
	public StringValidateException (String msg)
	{
		super(msg);
	}
	
}


public class StringCustomException {
	public static void digit(String str) throws StringValidateException{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
			throw new StringValidateException ("String contains digit");
			}
		
		}
		
		
	}
	

	public static void main(String[] args) 
	{
		String str="java";
		try
		{
			digit(str);
		}
		catch(StringValidateException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		

	}

}
