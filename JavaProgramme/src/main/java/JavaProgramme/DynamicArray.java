package JavaProgramme;

public class DynamicArray {

	public static void main(String[] args) 
	{
		// Problem Statement is find the missing number from  an array where numbers are added randomly.
		//Logic is take "sum" as a variable to do addition of available numbers from array.
		// sum of natural numbers from 1 to N, can be expressed as N*(N+1)/2.
		
		int[] arr = {1,2,3,5,6,9,7,10,8};
		int sum = 0;
		int idx=-1;
		int total=0;
		//total numbers with missing number is 10.
		int n = 9;
		int length = arr.length;
		
		for(int i =0;i<length;i++)
		{
			
			
				sum= sum+arr[i];
			
		}
		total = (length+1)* length/2 ;
		System.out.println("The missing number is" + (total-sum)); 
		

	}

}
