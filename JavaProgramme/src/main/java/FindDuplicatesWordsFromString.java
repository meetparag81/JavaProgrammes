import java.util.HashMap;
import java.util.Set;

public class FindDuplicatesWordsFromString 
{

	public static void main(String[] args) 
	{
		String s = "I am Parag and Parag is not a developer";
		
		String[] arr = s.split(" ");
		
		HashMap<String, Integer>Words = new HashMap<String, Integer>();
		
		//check each word from map with other
		for(String word:arr)
		{
			if(Words.containsKey(word))
			{
				Words.put(word, Words.get(word)+1);
			}
			else
			{
				Words.put(word, 1);
			}
		}
		
		//Now use keySet to take all words in Set
	System.out.println("Duplicate words are");
	Set<String>Eachwords=Words.keySet();// in Hashmap kyeset method returns a Set.
	
	for(String word1:Eachwords)
	{
		if(Words.get(word1)>1)// check the no of words which are more than one in map.
		{
			System.out.println(word1+":" + Words.get(word1));
		}
	}
	
	}

}
