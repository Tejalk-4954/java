package multi;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI_Demo1 {

	public static void main(String[] args) {
	
		List<Integer> list =new ArrayList<Integer>();
		list.add(123);
		list.add(100);
		list.add(112);
		
		list.stream().forEach((i)-> {//terminal Stream
			if(i%2==0)
			{
			  System.out.println(i);	
			}
		});
	}
}
