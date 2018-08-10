package JavaProgrammesIn;

public class Febonaci {

	public static void main(String[] args) 
	{
		
		int a= 0; int b= 1; int c;
		System.out.print(a+" "+ b );
		int count = 10;
		for(int i=2;i<=10;i++)
		{
			c= a+b;
			a= b;
			b= c;
			System.out.print( ", "+c);
		}

	}

}
