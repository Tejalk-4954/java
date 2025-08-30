package practice_day5;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class collectors3 {

	public static void main(String[] args) {
	
		Map<Integer,StringBuffer> map=Arrays.asList("Welcome","to","pune")
				.stream().map(StringBuffer::new)
				 .collect(Collectors.toMap(StringBuffer::length,StringBuffer::reverse));
		
		System.out.println(map);
		
//		Map<Integer,StringBuffer> tm=new TreeMap<Integer,StringBuffer>(map);
//			
//		System.out.println(tm);
	}
}
