package ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class EmployeeConsumer {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {  
	
	Class<?>c=Class.forName("ReflectionApi.Employee");
	
	System.out.println("**************CONSTRUCTORS*************");
	
	Constructor<?>[] con= c.getDeclaredConstructors();
	
	Object obj1=c.getConstructor().newInstance();
	Object obj2=c.getConstructor().newInstance();
	
	
	for(Constructor d:con)
	{
		System.out.println(d.getName());
		System.out.println(d.getParameterCount());
		System.out.println(d);
		
		Parameter[] p=d.getParameters();
		System.out.println("parameters::");
		
		for(Parameter pm:p)
		{
			System.out.println(pm.getModifiers());
			System.out.println(pm.getName());
			System.out.println(pm.getType());
		}
	 }
	
	System.out.println("*******************FIELDS********************");
	
	Field[] fields=c.getDeclaredFields();
	
	for(Field f:fields)
	{
		System.out.println(f);
	}
	
	Field Salary_field=c.getDeclaredField("salary");
	
	Salary_field.setAccessible(true);
	
	 Salary_field.set(obj1, 2345.55);
	System.out.println(Salary_field.get(obj1));
	
	
	System.out.println("*************METHODS***************");
	
	Method[] methods=c.getDeclaredMethods();
	
	for(Method m:methods)
	{
		System.out.println(m);
	}
	
	 System.out.println("invoking the Secure Method");
	 Method secure_demo=c.getDeclaredMethod("securemethod", int.class,int.class);
	 
	 secure_demo.setAccessible(true);
	 secure_demo.invoke(obj1, 100,123);
	
  }
}
