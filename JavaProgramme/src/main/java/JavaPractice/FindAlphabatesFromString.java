package JavaPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAlphabatesFromString 
{

	 

	public static void main(String[] args) 
	{
		int count=0;
	String s = "abcd123";
	
	Pattern p =  Pattern.compile("123");
	Matcher m = p.matcher(s);
	
	while(m.find())
	{
		
		count++;
		System.out.println(m.start());
	}
	System.out.println("No of times the numbers comes are"+ count);

	}

}
