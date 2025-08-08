package practice_day2;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Leader,Integer> map = new HashMap<Leader,Integer>();
		
		map.put(new Leader(1,"ABC"),1);
		map.put(new Leader(1,"ABC"),2);
		
		System.out.println(map);
//		System.out.println(map.containsKey(new Leader(1,"ABC")));

	}

}

class Leader
{
   int id;
   String name;
   
   public Leader(int id,String name)
   {
	   this.id=id;
	   this.name=name;
   }
   
   public int hashcode()
   {
	   return this.id;
   }
   
   public boolean equals(Object o)
   {
	   if(this==o)
	   {
		   return false;
	   }
	   
	   Leader lead=(Leader)o;
	   
	   if(lead.id==this.id && lead.name.equals(this.name))
	   {
		   return true;
	   }
	    return false;
		   
   }
}

