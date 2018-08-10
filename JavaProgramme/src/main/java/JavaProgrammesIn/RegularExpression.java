package JavaProgrammesIn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression 
{

	public static void main(String[] args) 
	{
		int count = 0;
		String s = "ababbaba";
		
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("ababbaba");
		
		while(m.find())
		{
			count++;
			System.out.println(m.start());
		}
		System.out.println("No of times the alphabates comes are"+ count);
			

	}

}
