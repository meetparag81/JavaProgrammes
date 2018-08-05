package JavaProgramme;

public class FindDuplicatesFromArray 
{

	public static void main(String[] args) 
	{
		int count=0;
		int[] arr = {1,5,6,8,10,5,6,8};
		
		for(int i = 0;i<= arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			
			
		}
		System.out.println(count);
		

	}

}
