package multi;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> isPrime=new Predicate<Integer>()
				{

					@Override
					public boolean test(Integer i) {
                    
						boolean flag=true;
								for(int j=0;j<=i/2;j++)
								{
								  if(i%j==0)
								  {
									  flag=false;
									  break;
								  }
								  return true;
								}
								if(flag)
								{
								   return true;	
								}
								else
								{
									return false;
								}
					}
	
				};
		
		Predicate<Integer> pred=new Predicate<Integer>()
				{

					@Override
					public boolean test(Integer i)//test is a abstract method of predicate it takes a parameter  
					{
						if(i%2==0)
						{
							return true;
						}
						return false;
					}
			
				};
				System.out.println(isPrime.test(2));
				System.out.println(pred.test(11));//predicate alsways gives boolean value either true or false
	}
}
