package com.Array;

import java.util.Arrays;
import java.util.Scanner;



class Book
{
	int book_id;
	String book_title;
	int price;
	String author_name;
	Book book[];
	int count=0;
	Book()
	{
		
	}
	void createBook()
	{
		book=new Book[3];
	}
	Book(int bid,String title,int price,String author)
	{
		this.book_id=bid;
		this.book_title=title;
		this.price=price;
		this.author_name=author;
	}
	
	public String toString()
	{
		return book_id+" "+book_title+" "+price+" "+author_name;
	}
	
	
	void insertBookRecords(int bid,String title,int price,String author)
	{
		book[count]=new Book(bid,title,price,author);
		count++;
	}
	
	
	void showAllBooks()
	{
		for(Book b:book)
		{
			if(b!=null)
			{
				System.out.println(b);
				
			}
		
		}
		System.out.println(Arrays.toString(book));
	}
	
	
	void showBookById(int id)
	{
		
		
		for(Book b:book)
		{
			if(b!=null)
		    {
				
				if(id==b.book_id)
				{
					System.out.println(b);
		   		}
				
				
		    }
			//if(id!=book_id) {
				//System.out.println("No record found");
			
	//	}
			
		
		
		}
				
		
	}	

			
			
				
			
		
	
	void updateBookById(int id)
	{
		Book b[]=new Book[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Update Book");
		System.out.println("Enetr book id you want to update");
		int b_id=sc.nextInt();
		int flag=0;
		for(int i=0;i<count;i++)
		{
			if(b[i].book_id==b_id)
			{
				flag=1;
				System.out.println("Enter the number which thing you want to update");
				System.out.println("1. Update the price \n 2. Update the id \n 3. Update the book name \n 4. Update the author name");
				int num=sc.nextInt();
				switch(num)
				{
				case 1:System.out.println("Enter the price you want to update");
				int  price=sc.nextInt();
				
				 break;
				case 2:System.out.println("Enter the id you want to update");
				int bid=sc.nextInt();
				 
				 break;
				  
			    
				 
				  
				  
				  }
		        
				}
			}
		}
		
		
	
		
	



	
	
	void deleteBookById(int id)
	{
		for(Book b:book)
		{
			if(b!=null)
		    {
				if(id==b.book_id)
				{
					b.book_id=0;
					b.book_title="null";
					b.price=0;
					b.author_name="null";
		   		}
				System.out.println(b);
		      }
		}
	}
}

public class ProjectDemo {

	public static void main(String[] args)
	
	{
		Book book=new Book();
		book.createBook();
		book.insertBookRecords(1, "The christmas pig", 150, "JK rowling");
		book.insertBookRecords(2, "Whereabouts", 200, "Jhumpa Lahiri");
		book.insertBookRecords(3, "Operation Khatma", 300, "Ashwini Bhatnagar");
		book.showAllBooks();
		
		
		System.out.println("------------------------------------------------------------");
		
		//book.showBookById(2);
		//book.deleteBookById(2);
		book.updateBookById(2);
		
		
		
		

	}



}
