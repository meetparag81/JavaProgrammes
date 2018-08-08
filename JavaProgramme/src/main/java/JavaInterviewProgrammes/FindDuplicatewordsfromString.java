package JavaInterviewProgrammes;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicatewordsfromString 
{

	public static void main(String[] args) 
	{
		String s = "Cirricullum";
<<<<<<< HEAD
		int len= s.length();
		int count = 0;
		int i , j;
		
		char[] arr = s.toCharArray();
		for ( i =0;i< len-1;i++)
=======
		String result = s.toLowerCase();
		HashMap<Character, Integer>charwordcount = new HashMap<Character, Integer>();
		char[]arr = result.toCharArray();// convert string into character
		//check each character of string array[arr]
		for(Character c :arr)
>>>>>>> branch 'master' of https://github.com/meetparag81/JavaProgrammes.git
		{
<<<<<<< HEAD
			for ( j =i+1;j<len-1;j++ )
=======
			if(charwordcount.containsKey(c))
>>>>>>> branch 'master' of https://github.com/meetparag81/JavaProgrammes.git
			{
<<<<<<< HEAD
				if( arr[i]== arr[j])
				{
					count++;
				}
				
				 
			}
			if(count> 1 )
			{
				System.out.println("The duplicate words are "+ arr[i] +" and cont is " + count);
=======
				charwordcount.put(c, charwordcount.get(c)+1); //If char is present in charCountMap, incrementing it's count by 1
>>>>>>> branch 'master' of https://github.com/meetparag81/JavaProgrammes.git
			}
			else
			{
				charwordcount.put(c, 1);//If char is not present in charCountMap,putting this char to charwordcount with 1 as it's value
			}
		}
		//Take all keys in one set of character;
		Set<Character>Keyscharacters = charwordcount.keySet();
		
		System.out.println("Duplicate characters in string"+result);
		for(Character ch:Keyscharacters)
		if(charwordcount.get(ch)>1) //If any char has a count of more than 1, printing it's count
		{
			System.out.println(ch + ":"+charwordcount.get(ch));
			
		}
		
<<<<<<< HEAD
=======
		
		
>>>>>>> branch 'master' of https://github.com/meetparag81/JavaProgrammes.git
	}

}
