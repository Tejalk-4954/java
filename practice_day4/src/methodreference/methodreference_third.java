package methodreference;

import java.util.ArrayList;
import java.util.List;

public class methodreference_third {

	public static void main(String[] args) {
		
		Car car=new Car();
		car.id=1;
        car.name="ferrari";
        
        Car car2=new Car();
        car2.id=101;
        car2.name="Audi";
        
        Car car3=new Car();
        car2.id=111;
        car2.name="i20";
        
        Car car4=new Car();
        car2.id=100;
        car2.name="thar";
        
        List<Car> list=new ArrayList<Car>();
        list.add(car);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        
        list.stream().filter(car::check).map(car::upper).forEach((i)->System.out.println(i));
        
	}

}

class Car
{
   int id;
   String name;
   
   public void checkid(Car car)
   {
	   System.out.println("id:"+car.name);
   }
   
   public String upper(Car car)
   {
	   return car.name.toUpperCase();
   }
   
   public boolean check(Car car)
   {
	   return  car.id>100;
   }
}