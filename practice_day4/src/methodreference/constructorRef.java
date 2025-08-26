package methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class constructorRef {
	
	//Constructor references in Java 8 provide a concise way to refer to constructors without explicitly instantiating the class, especially when working with functional interfaces. 
	  //They are a special type of method reference.
	//****The syntax for a constructor reference is ClassName::new.*****

	public static void main(String[] args)
	{
		 BiFunction<String,String,Object> fun=car::new;
		 
		 fun.apply("Mustang", "Ford");
		 
		 Function<String ,car> fun3=car::new;
		 fun3.apply("Alto");
		 
		 Ternary<Integer,String, String, String,car > ter=car::new;
		 ter.tertiary(12, "alto", "1234556", "tatapunch");
		
	}

}


class car
{
   String name;
   String company;
   
   public car(String name,String company)
   {
	   this.name=name;
	   this.company=company;
	   System.out.println("object created:"+name);
   }
   
   public car(String name)
   {
	   this.name=name;
	   
	   System.out.println("object createss:"+name);
   }
   
  
   public car(int id, String city, String pin, String state)
	{
		System.out.println("Object create:"+id+city+pin+state);
	}
}



interface Ternary<A,B,C,D,R>
{
	
	public R tertiary(A a,B b,C c,D d);
}