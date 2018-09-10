package JavaProgrammesIn;

public class TwoDimenstionalArray {

	public static void main(String[] args) 
	{
		Integer[][] myArray = {{10, 20, 30}, {11, 21, 31}, {12, 22, 32} };
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(myArray[i][j]);
			}
			System.out.println(" ");
		}

	}

}
