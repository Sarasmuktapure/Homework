package com.Array;

import java.util.Scanner;

class Student{
	int sid;
	String sname;
	String addr;
	
	Student(int sid,String sname,String addr)
	{
		this.sid=sid;
		this.sname=sname;
		this.addr=addr;
	}
	public String toString()
	{
		return sid+" "+sname+" "+addr;
	}
}

public class Course
{
	int cid;
	String cname;
	int fees;
	Student s;
	
	Course(int cid, String cname, int fees, Student s)
	{
		this.cid=cid;
		this.cname=cname;
		this.fees=fees;
		this.s=s;
	}
	public String toString()
	{
		return cid+" "+cname+" "+fees+" "+s;
	}
	
		
	public static void main(String[] args)
	{
		Course []c=new Course[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Enter the course id");
			int id=sc.nextInt();
			System.out.println("Enter the course name");
			String name=sc.next();
			System.out.println("Enter the course fees");
			int fees=sc.nextInt();
			
			System.out.println("Enter the details for student");
			System.out.println("Enter student id is");
			int sid=sc.nextInt();
			System.out.println("Enter the student name");
			String sname=sc.next();
			System.out.println("Enter the address of student");
			String addr=sc.next();
			
			Student s=new Student(sid,sname,addr);
			c[i]=new Course(id,name,fees,s);
		}
			
			for(int i=0;i<c.length;i++)
			{
			System.out.println(c[i]);
			}
			
			

			}
		

	}


