package Patterns;

public class Nine 
{
  /* **1
	 *1 2
	 1 2 3*/

	public static void main(String[] args) 
	 {
		for(int i=1;i<=3;i++)
		{	
			for(int k=2;k>=i;k--)
			{
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
			
		}
			

	}

}
