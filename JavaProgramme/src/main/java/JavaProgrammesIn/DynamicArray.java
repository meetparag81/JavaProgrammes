package JavaProgrammesIn;

public class DynamicArray
{

	public static void main(String[] args) 
	{
		int sum = 0;
		int idx= -1;
		int arr[] = {1,5,3,4,6,8,7,9,10,11,13,12,14,16,15,17,18,20,19};
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]== 0)
			{
				idx= i;
			}
			else
			{
				sum = sum +arr[i];
			}
			
				
		}
		int total = (arr.length+1)*(arr.length)/2;
		
	System.out.println("The missing Number is" + ( total- sum)+ "at index" + idx );
	

	}

}
