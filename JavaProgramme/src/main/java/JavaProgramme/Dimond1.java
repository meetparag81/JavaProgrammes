package JavaProgramme;

public class Dimond1 {

	public static void main(String[] args) 
	{
		for(int row = 1;row<=5;row++)
		{
			for(int space=4;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println("");
		}
		for(int k=0;k<=4;k++)
		{
			for(int l=0;l<=k;l++)
			{
				System.out.print(" ");
			}
			for(int m= 4;m>k;m--)
			{
				System.out.print("*"+ " ");
			}
			System.out.println("");
		}
			

	}

}
