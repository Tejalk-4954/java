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
		
		String str=Arrays.asList("abc","def","ghi","jkl","mno").stream().collect(new NameAppender());
		System.out.println(str);
	}
}

class NameAppender implements Collector<String,StringBuffer,String>
{

	@Override
	public Supplier<StringBuffer> supplier() {
		
		Supplier<StringBuffer> supplier=StringBuffer::new;
		return supplier;
	}

	@Override
	public BiConsumer<StringBuffer, String> accumulator() {
		
		BiConsumer<StringBuffer, String> bi=(sb,s)->{
              
		  sb.append(s);
		};
		
		return bi;
	}

	@Override
	public BinaryOperator<StringBuffer> combiner() {
		
		BinaryOperator<StringBuffer> bin=(sb1,sb2)->(sb1.append(sb2));
		
		return bin;
	}

	
	public Function<StringBuffer, String> finisher() {
		
		Function<StringBuffer, String> fun=(sb)->sb.toString().toUpperCase();
		
		return fun;
	}

	@Override
	public Set<Characteristics> characteristics() {
		
		return Collections.EMPTY_SET;
	}
	
}