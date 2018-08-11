package Practice1;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) 
	{
		
		String s = "cirricullum";
		//add each character in a character array
		char[]arr= s.toCharArray();
		// add each character in HashMap with key as character and value as integer
		
		HashMap<Character, Integer> WordMap = new HashMap<Character, Integer>();
		//check eachcharacter from the array to identify keys
		for(Character c:arr)
		{
			if(WordMap.containsKey(c))
			{
				WordMap.put(c, WordMap.get(c)+1);//If char is present in charCountMap, incrementing it's count by 1
			}
			else
			{
				WordMap.put(c, 1);//If char is not present in charCountMap, add value=1)
			}
		}
		//takethesekeysinSet(character)
		Set<Character>keyschars = WordMap.keySet();//keyset returnsthe "set,hence we can use it in map, this is called as collection views of Map
		for(Character ch :keyschars)
		{
			if(ch>1)
			{
				System.out.println( ch  + "and count is "+WordMap.get(ch));// get kye is used to get jeys from map
			}
		}

	}

}
