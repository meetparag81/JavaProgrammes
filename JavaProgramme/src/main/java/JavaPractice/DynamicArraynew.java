package JavaPractice;

import java.util.HashMap;

public class DynamicArraynew {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,5,6,9,7,10,8};
		int length = arr.length;
		int sum=0;
		int idx=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				idx=1;
			}
			else
			{
				sum= arr[i]+sum;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	/*	for(int i=0;i<length; i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]!=arr[j])
				{
					continue;
				}
				else
				{
					System.out.println("MidssingNo is" + arr[i]);
				
				}
			}
		}*/

	}

}
