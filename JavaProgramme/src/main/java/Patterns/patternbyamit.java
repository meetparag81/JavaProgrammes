package Patterns;

public class patternbyamit {

	public static void main(String[] args) 
	{
		int space;
		int n=5;
		
		for(int r=1; r<=n; r++)
		{
			space = n-r;
			for(int c=1; c<=r; c++)
			{
				while(space>0)
				{	
				System.out.print(" ");
				//System.out.print("  "); //only give just space to show output right side triangle 
				space = space -1;
				}
				System.out.print(c + " ");
			}
			System.out.println("");
		}
		

	}

}
