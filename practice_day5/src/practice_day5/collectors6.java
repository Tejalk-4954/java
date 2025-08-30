package practice_day5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class collectors6 {

	public static void main(String[] args) {
		
		String str = Arrays.asList("abc","def","ghi","jklM").stream()
				.collect(new nameAppend());
		
		System.out.println(str);
		
	}
}

class nameAppend implements Collector<String,StringBuilder,String>
{

	
	public Supplier<StringBuilder> supplier() {
		
		Supplier<StringBuilder> sup=StringBuilder::new;
		return sup;
	}

	
	public BiConsumer<StringBuilder, String> accumulator() {
		
		 BiConsumer<StringBuilder, String> bi=(sb,s)->{
			sb.append(s); 
		 };
		return bi;
	}

	
	public BinaryOperator<StringBuilder> combiner() {
		BinaryOperator<StringBuilder> str=(sb1,sb2)->(sb1.append(sb2));
		
		return str;
	}

	
	public Function<StringBuilder, String> finisher() {
		Function<StringBuilder, String> fun=(sb)->sb.toString().toUpperCase();
		
		return fun;
	}

	@Override
	public Set<Characteristics> characteristics() {
		return Collections.EMPTY_SET;
	}


}

