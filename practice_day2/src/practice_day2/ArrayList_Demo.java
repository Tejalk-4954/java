package practice_day2;

import java.util.ArrayList;

public class ArrayList_Demo {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(23);
		list.add(15);
		list.add(44);
		
		System.out.println(list.get(0));
		list.remove(0);
		
		long time=System.nanoTime();
		System.out.println("time Required:"+time/1000000000);
	}

}
