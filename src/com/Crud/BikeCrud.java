package com.Crud;

import java.util.Scanner;
public class BikeCrud 
{

	public static void main(String[] args) 
	{
        Bike b[]=new Bike[10];
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		int flag=0;
		
		while(true)
		{
			System.out.println("1.Add Bike");
			System.out.println("2.Update Bike");
			System.out.println("3.Delete Bike");
			System.out.println("4.Search Bike");
			System.out.println("5 View Bike");
			System.out.println("6 Exit");
			
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			int bikeid,price;
			String bname,bcolour;
			
			int b_id;
			
			switch(choice)
			{
			case 1:
				System.out.println("Add Bike");
				System.out.println("Enter number of bikes");
				int a=sc.nextInt();
				for(int i=0;i<a;i++)
				{
					System.out.println("Enter bike id");
					bikeid=sc.nextInt();
					System.out.println("Enter bike name");
					bname=sc.next();
					System.out.println("Enter bike colour");
					bcolour=sc.next();
					System.out.println("Enter price");
					price=sc.nextInt();
					b[count]=new Bike(bikeid,bname,bcolour,price);
					count++;
					
				}
				System.out.println("Add bike succesfully");
				break;
				
			case 2:
				System.out.println("Update Bike");
				System.out.println("Enetr bike id you want to update");
				b_id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(  b[i].getbId()==b_id)
					{
						flag=1;
						System.out.println("Enter the number which thing you want to update");
						System.out.println("1. Update the price \n 2. Update the id \n 3. Update the name \n 4. Update the colour");
						int num=sc.nextInt();
						switch(num)
						{
						case 1:System.out.println("Enter the price you want to update");
						 price=sc.nextInt();
						 b[i].setPrice(price);
						 break;
						case 2:System.out.println("Enter the id you want to update");
						 b_id=sc.nextInt();
						 b[i].setbId(b_id);
						 break;
						case 3:System.out.println("Enter the bike name you want to update");
						 bname=sc.next();
						 b[i].setbName(bname);
						 break;
						case 4: System.out.println("Enter the bike colour you want to update");
						 bcolour=sc.next();
						 b[i].setbColour(bcolour);
						 break;
						 default:System.out.println("Invalid input");
						
						}
				  }
				}
				if(flag==0)
				{
					System.out.println("book is not present");
				}
				break;
				
			case 3:	
				System.out.println("Delete Bike");
				System.out.println("Enetr bike id you want to delete");
				 b_id=sc.nextInt();
				 for(int i=0;i<count;i++)
					{
						if(b[i].getbId()==b_id)
						{
							flag=1;
							b[i]=null;
							System.out.println("bike delete sucessfully");
						}
		             }
				 
				 if(flag==0)
					{
						System.out.println("bike is not present");
					}
				 break;
				 
			case 4:System.out.println("Search bike by id");
			System.out.println("Enetr bike id you want to search whether it is present or not");
			 b_id=sc.nextInt();
			 for(int i=0;i<count;i++)
				{
					if(b[i].getbId()==b_id)
					{
						flag=1;
						break;
				    }
					else
					{
						flag=0;
					}
				}
			 if(flag==1)
			 {
				 System.out.println("Bike is present");
			 }
			 else
			 {
				 System.out.println("Bike is not present");
			 }
				
			 break;
			 
			 
			case 5:
				System.out.println("show bikes");
				System.out.println(count);
				for(int i=0;i<count;i++)
				{
					if(b[i]!=null)
					{
					System.out.println(b[i]);
					}
				}
				break;
				
			case 6:
				System.exit(0);
				break;
				
			}

		}
			
	}
}
		


