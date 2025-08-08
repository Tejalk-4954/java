package Collection_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_demo {

	public static void main(String[] args) {
		HashMap map =new HashMap();
		map.put(1,"amit");
		map.put(2,"rahul");
		map.put(5,"jay");
		map.put(6,"Amit");
		
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

}
