package methodreference;

public class methodreference_six {
	
  public static String validatenumber(String number)
		 {
			 
			 if( number.length()==10)
			 {
				 return "please enter:";
			 }
			 return "chukicha number";
		 }
		public static void main(String[] args) {
			
			
			Validator<String,String> validate=methodreference_six::validatenumber;
			
			System.out.println(validate.validate("1234567891"));
		}
	}

	@FunctionalInterface
	interface Validator<T,R> 
	{
		public R  validate(T t);
	}

