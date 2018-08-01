package Practice1;

public class Fibonaci1 {

	public static void main(String[] args) 
	{
		
		int a=0;
		int b=1;int c = 0;
		int count =10;
		System.out.print(a+ ","+ b);
		for(int i=1;i<=count;i++)
		{
		c = a+b;
		a= b;
		b=c;
		
		System.out.print(","+c);
		}
		

	}

}
