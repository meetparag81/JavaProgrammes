package javaObjectiveProgramms;

public class Test2 
{
	static int x1=20;
	Test2(int x2)
	{
		this.x1 = x2;
	}
	
	 
	 static int fun()
	{
		 //static int x=20; // static  local variables are not allowed
		return ++x1 ;
		
	}
	
	public static void main(String[] args) 
	{
		Test2 obj= new Test2(10);
		Test2 obj1= new Test2(40);
		
		System.out.println(x1);// 40 will be printed
	}

}
