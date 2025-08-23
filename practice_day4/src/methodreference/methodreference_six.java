package methodreference;

public class methodreference_six {
	
	public static String validateNumber(String number)
	{
		if(number.length()==10)
		{
			return "Enter number:";
		}
		return "Inavlid number";
		
	}
	
	public static void main(String[] args) {
		 Validator<String,String> validate = methodreference_six:: validateNumber;
		 
		 System.out.println(validate.validate("1234567891"));
		
	}
	
}
  
	@FunctionalInterface
	interface Validator<T,R> 
	{
		public R  validate(T t);
	}

