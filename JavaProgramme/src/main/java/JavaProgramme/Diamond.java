package JavaProgramme;

public class Diamond 
{
 /*     *
	   * *  
	  * * *
	 * * * *
	* * * * *
	 * * * *
	  * * *
	   * * 
	    *   */

	public static void main(String[] args) 
	{
		for(int i =1;i<=5;i++)// used for No of rows
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) // used to print * in columns, column is depends on rows
			{
				if(i%2!=0)
				System.out.print("*" + " ");
			}
			System.out.println("");// used to go on second line
		}
		for(int m=4;m>0;m--)// for next rows are 4-7,9,
		{
			for(int l=1;l<=m;l++)
			{
				System.out.print( " ");
			}
			for(int n=3;n<=m;n++)
			{
				if(m%2!=0)
				{
				System.out.print( " "+ "*");
				}
			}
				System.out.println( "");
			}
		}
		
			

	}


