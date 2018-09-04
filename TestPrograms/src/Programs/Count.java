package Programs;

import java.util.HashMap;
import java.util.Map;

public class Count {
	
	public static void main(String[] args) {
	
		String name="my name is akash and i am from jammu city.";
		
		int len=name.length();
		int value;
		
		HashMap<Character, Integer> words= new HashMap<>();
		
		for(int i=0;i<len;i++)
		{
			if(words.containsKey(name.charAt(i)))
			{
				value=words.get(name.charAt(i));
				value++; 
				words.put(name.charAt(i), value);
			}
			
			else
			{
				words.put(name.charAt(i), 1);
			}
		}
		
		for(Map.Entry m:words.entrySet())
		{
			//System.out.println( ch +" "+words.get(ch) );
			 System.out.println(m.getKey()+" "+m.getValue()); 
		}
		
	}

}
