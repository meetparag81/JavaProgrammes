package Patterns;

public class sixthpattern 
{
//	  1  
//	  1 2  
//	 1 2 3  
//	1 2 3 4

	public static void main(String[] args)
	{
		int n= 3;
		for(int i =1;i<=4;i++)// this will go to each row
		{
			for(int k=n;k>=i;k--) //this will use for space
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)// this will print the number 
			{
				System.out.print(j+ " ");
			}
			System.out.println(" ");
		}
	

	}

}
