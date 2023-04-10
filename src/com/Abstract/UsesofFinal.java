package com.Abstract;
// all uses of final in single application

class Student{
	//final int id=2;
	/*
	 * final int id; Student() { id=2; }
	 */
	
	static final int id;
	static
	{
		id=2;
	}
	String name;
	
	public final void display(String name)
	{
		System.out.println("Name is="+name+ "\n" +"ID is="+id );
		
	}
}
public class UsesofFinal extends Student {

	public static void main(String[] args) {
		UsesofFinal uf=new UsesofFinal();
		uf.display("Saras");

	}

}
