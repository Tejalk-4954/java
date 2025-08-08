package practice_day1;

public class anonymous_InnerClass_example {

	public static void main(String[] args) {
		MyFunctionalInterface instance = new MyFunctionalInterface()
				{

					@Override
					public void performAction(String msg) {
						System.out.println("Anonymous inner performing action");
						
					}
			
				};	
				
				instance.performAction("hello!!");
	}

}

interface MyFunctionalInterface
{
	void performAction(String msg);
}