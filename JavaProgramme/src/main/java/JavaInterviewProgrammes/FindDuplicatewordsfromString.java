package JavaInterviewProgrammes;

public class FindDuplicatewordsfromString 
{

	public static void main(String[] args) 
	{
		String s = "Panctuation";
		int len= s.length();
		int count = 0;
		int i , j;
		
		char[] arr = s.toCharArray();
		for ( i =0;i< len;i++)
		{
			for ( j =i+1;j<len;j++ )
			{
				if( arr[i]== arr[j])
				{
					count++;
				}
				 
			}
			
		}
		System.out.println("The duplicate words are"+ arr[i] +" and cont is" + count);
	}

}
