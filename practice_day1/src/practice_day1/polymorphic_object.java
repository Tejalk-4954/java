package practice_day1;

public class polymorphic_object {
	
	static {
		System.out.println("static block");
	}
   public static void main(String[] args) {
	   creature ct = new creature();
	   ct.eat();
	   ct.drink();
	   ct.breathe();	  
  }
    
	
}

interface Animal_kingdom{
	public void eat();
	public void drink();
	
	public default void breathe() {
		 System.out.println("Animal breathing");
	}
	
}

interface plant_kingdom{
	public void eat();
	public void drink();
	public void breathe();
	
}

class creature implements Animal_kingdom,plant_kingdom{

	@Override
	public void eat() {
		System.out.println("eating");
	}

	@Override
	public void drink() {
		System.out.println("drinking water");
		
	}

	@Override
	public void breathe() {
//		System.out.println("breathe");
		 Animal_kingdom.super.breathe();
	}
	
	
	
}