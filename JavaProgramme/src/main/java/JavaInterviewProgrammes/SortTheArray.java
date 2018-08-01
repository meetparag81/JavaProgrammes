package JavaInterviewProgrammes;

public class SortTheArray 
{

	public static void main(String[] args) 
	{ int i=0;
		int temp = 0;
		int arr[] = {10,-5,6,20,30};
		int lenghth = arr.length;
		
		for( i=0;i<5;i++)
		{
		for(int j=0;j<5;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
			
		}
		for(int k=0;k<lenghth;k++)
		{
			System.out.println(arr[k]);
		}
		

	}

}
