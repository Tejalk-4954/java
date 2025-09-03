package multi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class StreamApi_reduce {
public static void main(String[] args) {

	List<Integer> list=new ArrayList<Integer>();
	
	list.add(100);
	list.add(20);
	list.add(40);
	list.add(60);
	
	BinaryOperator<Integer> bin=(i,j)->(i+j);
	
//	BiFunction<Integer,Integer,Double> bi=(i,j)->(i+j+2.0);
//	System.out.println(bi.apply(10, 20));
	
	int i=list.stream().reduce(10, bin);
	
  System.out.println(i);
	
	
 }
}
