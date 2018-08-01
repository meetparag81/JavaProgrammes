package Programmes;

public class DimondPattern {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int k =2;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
			System.out.print("*"+ " ");	
				}
			}
			System.out.println("");
		}

	}

}
