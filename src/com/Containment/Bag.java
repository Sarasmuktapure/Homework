package com.Containment;
class Nib{
	String ntype;
	int nprice;
	
	Nib(String ntype, int nprice)
	{
		this.ntype=ntype;
		this.nprice=nprice;
	}
	
	void nibShow()
	{
		System.out.println(ntype+" "+"Rs."+nprice);
	}
	
}
class Pen{
	String pcolour;
	String pname;
	int pprice;
	Nib nib;
	
	Pen(String pcolour,String pname, int pprice, Nib nib)
	{
		this.pcolour=pcolour;
		this.pname=pname;
		this.pprice=pprice;
		this.nib=nib;
	}
	void displayPen()
	{
		System.out.println(pcolour+" "+pname+" "+"Rs."+pprice);
		nib.nibShow();
	}
	
}

public class Bag 
{
	int bid;
	int bprice;
	String bcolour;
	Pen pen;
	
	Bag(int bid, int bprice, String bcolour, Pen pen)
	{
		this.bid=bid;
		this.bprice=bprice;
		this.bcolour=bcolour;
		this.pen=pen;
	}
		void displayBag()
		{
			System.out.println(bid+" "+"Rs."+bprice+" "+bcolour);
			pen.displayPen();
		}

	

	public static void main(String[] args) {
		Nib n=new Nib("Oblique",20);
		
		Pen p=new Pen("Blue","Reynolds",10,n);
		
		Bag b=new Bag(12,450,"Black",p);
		
		b.displayBag();

	}

}
