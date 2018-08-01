package Patterns;

/*1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15*/
public class eightPattern {

	public static void main(String[] args) 
	{
		int k=1;
		for(int i=1;i<=5;i++)//for row
		{
			
			for(int j=1;j<i+1;j++)//for column
			{
				System.out.print(k++ + " ");
				
			}
			System.out.println();
		}

	}

}
