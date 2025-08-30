package practice_day5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class collectors1 {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("abc","ade","eedfg","dfjnjrn","dnedkd");
		
		list.stream().map(String::length).collect(Collectors.toList()).sort((i,j)->{
			if(i>j)
			{
				return 1;
			}
			else if(i<j)

			{
				return -1;
			}
			return 0;
		});

	}

}
