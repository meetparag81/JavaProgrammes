package JavaInterviewProgrammes;

public class ReverseTheString {

	public static void main(String[] args) 
	{
		String s = "parag";
		String rev ="";
		int length = s.length();
		
		for(int i= length-1;i>=0;i-- )// if if didn't take ">=" the first word, i.e. P gets skipped
		{
			rev = rev + s.charAt(i);
			
			
		}
		System.out.println(rev);

	}

}
