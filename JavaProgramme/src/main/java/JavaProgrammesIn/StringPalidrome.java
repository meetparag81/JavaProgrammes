package JavaProgrammesIn;

public class StringPalidrome 
{
	
	public static boolean IsPalidrome(String str)
	{
		if(str==null)
		{
			return false;
		}
		
		int length= str.length();
		for(int i =str.length()-1;i>0;i--)
		{
			if(str.charAt(i)!=str.length()-i-1)
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) 
	{
		

	}

}
