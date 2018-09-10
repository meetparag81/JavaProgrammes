package JavaProgrammesIn;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicatewordsfromString 
{

	public static void main(String[] args) 
	{
		String s = "Cirricullum";
		String result = s.toLowerCase();
		HashMap<Character, Integer>charwordcount = new HashMap<Character, Integer>();
		char[]arr = result.toCharArray();// convert string into character
		//check each character of string array[arr]
		for(Character c :arr)
		{
			if(charwordcount.containsKey(c))
			{
				charwordcount.put(c, charwordcount.get(c)+1); //If char is present in charCountMap, incrementing it's count by 1
			}
			else
			{
				charwordcount.put(c, 1);//If char is not present in charCountMap,putting this char to charwordcount with 1 as it's value
			}
		}
		//Take all keys in one set of character;
		Set<Character>Keyscharacters = charwordcount.keySet();// .keyset returns a set used to  view keys in map 
		
		System.out.println("Duplicate characters in string"+result);
		for(Character ch:Keyscharacters)
		if(charwordcount.get(ch)>1) //If any char has a count of more than 1, printing it's count
		{
			System.out.println(ch + ":"+charwordcount.get(ch));
			
		}
		
		
		
	}

}
