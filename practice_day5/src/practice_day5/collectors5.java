package practice_day5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collectors5 {

	public static void main(String[] args) {
		
		Map<Object,List<String>> map= Arrays.asList("sanika","sakshi","tejal","Priyanka")
				.stream().map((s)->s.toUpperCase()).collect(Collectors.groupingBy((s)->s.charAt(0)));
		
		System.out.println(map);
	}
}
