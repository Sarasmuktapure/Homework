package com.Array;

public class OccuranceElement {

	public static void main(String[] args) 
	{
        int arr[]= {1,2,1,1,2,2,2,2,1,3,3,3,6,6,6,6,6};
		
		int freq[]=new int[arr.length];
		int newarr[]=new int[arr.length];
		boolean visited;
		int x=0;
		int i;
		for( i=0;i<arr.length;i++)
		{
			int count=1;
			visited=false;
			 
			 for(int j=i-1;j>=0;j--)
			 {
				 if(arr[i]==arr[j])
				 {
					 visited=true;
					 break;
				 }
			 }
			 if(visited==false ) 
			 {
				 
			 
				 for(int k=i+1;k<arr.length;k++)
				 {
					
				 
					 if(arr[i]==arr[k])
					 {
						 count++;
					 }
					 
				 
			 }
				 newarr[x]=arr[i];
				 freq[x]=count;
				 x++;
			 }
		
		
		}
		// 1->4 2->5 3->3
		int max=freq[0];
		int min=freq[0];
		int minele=newarr[0];
		int maxele=newarr[0];
		for(int j=1;j<x;j++)
		{
			if(freq[j]<min)
			{
				min=freq[j];
				minele=newarr[j];
			}
			if(freq[j]>max)
			{
				max=freq[j];
				maxele=newarr[j];
			}
			
			
		}
		System.out.println(minele+"--  "+min);
		System.out.println(maxele+"--  "+max);
		
				

		

	}

}
