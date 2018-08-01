package ArrayPrograme;

public class DynamicArray {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,5,6};
	
		int sum = 0;
		int idx = -1;
		int length = arr.length;
		for (int i = 0; i < length; i++)
		{
		    if (arr[i] == 0)
		    {
		         idx = i; 
		    }
		    else 
		    {
		         sum += arr[i];
		    }
		

	}
		// the total sum of numbers between 1 and arr.length.
		int total = (arr.length + 1) * arr.length / 2;
	}
}

