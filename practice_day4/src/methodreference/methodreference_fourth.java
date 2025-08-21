package methodreference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class methodreference_fourth {

		 public static double convert(int i)
		 {
			 if(i>=10)
			 {
				 return i+1.0;
			 }
			 return 1.0;
		 }
		 
	 public static void main(String args[])
	{
	Function<Integer,Double> fun =	methodreference_fourth::convert; 
	
	System.out.println(fun.apply(11));
	
	Predicate<Integer> check= checkint::checkage;
	
	System.out.println(check.test(48));
	
	Consumer<String> writename=checkint::printname;
	 
	 writename.accept("shruti");
		 
	Supplier<String> getname = checkint::getname;
	 
	System.out.println(getname.get());
	 }
}


class checkint
{
  public static boolean checkage(int i)
  {
	  if(i>10 && i<50)
	  {
		  return true;
	  }
	  
	  return false;
  }
  
  public static void printname(String name)
  {
	  System.out.println(name);
  }
  
  public static String getname()
  {
	  return("snehal");
  }
}