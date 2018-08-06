package JavaInterviewProgrammes;

public class FindDuplicatewordsfromString 
{

	public static void main(String[] args) 
	{
		String s = "Cirricullum";
		int len= s.length();
		int count = 0;
		int i , j;
		
		char[] arr = s.toCharArray();
		for ( i =0;i< len-1;i++)
		{
			for ( j =i+1;j<len-1;j++ )
			{
				if( arr[i]== arr[j])
				{
					count++;
				}
				
				 
			}
			if(count> 1 )
			{
				System.out.println("The duplicate words are "+ arr[i] +" and cont is " + count);
			}
			
		}
		
	}

}
