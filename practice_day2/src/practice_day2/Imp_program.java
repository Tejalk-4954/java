package practice_day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Imp_program {

	public static void main(String[] args) {
		
		String  str="necessary";//{h=1, e=1, l=2,o=1}

		Map<Character, Integer> map=new HashMap<Character, Integer>();


		for(char c:str.toCharArray())
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else

			{
				map.put(c,1);	
			}
		}

		System.out.println(map);
		
		for(Map.Entry<Character, Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+ e.getValue());
		}
		
	}

}

