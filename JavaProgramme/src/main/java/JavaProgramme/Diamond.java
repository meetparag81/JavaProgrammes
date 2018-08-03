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
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) // used to print * in columns, column is depends on rows
			{
				System.out.print("*" + " ");
				/*if(i%2!=0)
				{
				System.out.print("*" + " ");
				}*/
			}
			System.out.println("");// used to go on second line
		}
		for(int m=0;m<4;m++)// for next rows are 4-7,9,
		{
			for(int l=0;l<=m;l++)
			{
				System.out.print( " ");
			}
			for(int n=4;n>m;n--)
			{
				System.out.print( "*"+ " ");
				/*if(m%2!=0)
				{
				System.out.print( " "+ "*");
				}*/
			}
				System.out.println( "");
			}
		}
		
			

	}


