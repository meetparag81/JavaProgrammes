package JavaPractice;

public class Test 
{
	static Integer intObj;
	
		    
		      
		   


	public static void main(String[] args) 
	{
		
		try
		{
		 intObj=Integer.valueOf(args[args.length-1]);
		}
		catch(Exception e)
		{
			System.out.println("Exception is seen");
		}
	      int i = intObj.intValue();

	      if(args.length > 1) 
	         System.out.println(i);
	      if(args.length > 0)
	         System.out.println(i - 1);
	      else 
	         System.out.println(i - 2);

	}

}
