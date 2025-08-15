package multi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamApi_filterDemo {

	public static void main(String[] args) {
	
		List<Integer> list =new ArrayList<Integer>();
		
		Predicate<Integer> pred =new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if(t>300)
				{
					return true;
				}
				else {
				return false;
				}
			}
			
		};
		
		list.add(100);
		list.add(200);
		list.add(350);
		list.add(530);
		
		//filter is a intermeditory method , uses a predicate instatnce which has a test method ,filter and map both takes a stream and also return the stream 
		list.stream().filter(pred).forEach((i)-> System.out.println(i));
	}

}
