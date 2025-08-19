package methodreference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class methodreference_second {

	public static void main(String[] args) {
		
		
		Function<Integer,Double> function=helper::cube;
		
		System.out.println(function.apply(9));
		
		System.out.println("**************************************");
		
		Consumer<Integer> con=helper::consumer;
		con.accept(100);
		
		System.out.println("**************************************");

		Predicate<Integer> pred =helper::check;
		System.out.println(pred.test(13));

	}

}

class helper
{
   
	 public static double cube(int num)
	 {
		 return num*num*num+1.0;
	 }
	 
	 public static void consumer(int i)
	 {
		 System.out.println("printing::"+i);
	 }
	 
	 public static boolean check(int i)
	 {
		 return i>10;
	 }
}