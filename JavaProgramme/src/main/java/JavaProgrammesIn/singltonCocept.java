package JavaProgrammesIn;

public class singltonCocept
{
	static singltonCocept instance= null;
	public String str;
	
	private singltonCocept()
	{
		str = "Iamsinglton";
	}
	
	public static singltonCocept getinstsnce()
	{
		int count=0;
		if(instance == null&&count<=5)
		{
			instance= new singltonCocept();
			count++;
		}
		return instance;
		
	}
			

	public static void main(String[] args) 
	{
		
		
		{
			singltonCocept x= instance.getinstsnce();
		}
		 
		singltonCocept y = instance.getinstsnce();
		
		
		
	}

}
