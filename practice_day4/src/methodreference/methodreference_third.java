package methodreference;

import java.util.ArrayList;
import java.util.List;

public class methodreference_third {

	public static void main(String[] args) {
		Car c=new Car();
		
		Car c1=new Car();
		c1.id=1;
		c1.name="a";
		
		Car c2=new Car();
		c2.id=11;
		c2.name="b";
		
		Car c3=new Car();
		c3.id=100;
		c3.name="c";
		
		List<Car> list=new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		list.stream().filter(c::checkid).map(c::upper).forEach((i)->System.out.println(i));
		
		//cars.stream().filter(car::check).map(car::upper).forEach((i)->System.out.println(i));

		
	}
}

class Car{
	int id;
	String name;
	
	public boolean checkid(Car car) {
		return car.id>10;
	}
	
	public String upper(Car car) {
		return car.name.toUpperCase();
	}
	
	public void display(Car car) {
		System.out.println(car.name);
	}
}