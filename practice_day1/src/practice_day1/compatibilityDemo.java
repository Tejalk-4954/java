package practice_day1;

public class compatibilityDemo {

	public static void main(String[] args) {
		myservice service=new myserviceDemo();//polymorphic object 
		service.oldMethod();
		service.newMethod();//calls the default method , here the backward compatibility achieves

	}

}

interface myservice
{
	void oldMethod();
	public default void newMethod()
	{
		System.out.println("defult method implementation");
	}
}

class myserviceDemo implements myservice
{

	@Override
	public void oldMethod() {
		System.out.println("implementation of old method");
		
	}
	
	
	
}