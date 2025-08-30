package practice_day5;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class collectors2 {

	public static void main(String[] args) {
		
		Set<Integer> set= Arrays.asList("Employee","1111111111111","horse","camel","elephan").stream()
        .map(String::length).collect(Collectors.toSet());
		System.out.println(set);
	}

}
