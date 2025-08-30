package practice_day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class collector7 {

public static void main(String[] args) {
	
	List<String> list = Arrays.asList("hii","hello","how","heyyy")
			.stream().collect(new nameList());
	System.out.println(list);
 }
}

class nameList implements Collector<String,List<String>,List<String>>
{

	
	public Supplier<List<String>> supplier() {
		
		Supplier<List<String>> sup=ArrayList::new;
		return sup;
	}

	
	public BiConsumer<List<String>, String> accumulator() {
	
		BiConsumer<List<String>, String> bic=(list,str)->{
			list.add(new StringBuilder(str).reverse().toString().toUpperCase());
			};
		return bic;
	}

	
	public BinaryOperator<List<String>> combiner() {
		
		BinaryOperator<List<String>> bin=(list1,list2)->{
			
			list1.addAll(list2);
			return list1;
		};
		
		return bin;
	}


	public Function<List<String>, List<String>> finisher() {
		
		Function<List<String>, List<String>> fun=(list)->(list);
		return fun;
	}

	
	public Set<Characteristics> characteristics() {
		
		return Collections.EMPTY_SET;
	}
	
}