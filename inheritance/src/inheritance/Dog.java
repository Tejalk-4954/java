package inheritance;

public class Dog extends animal{

	public static void main(String[] args) {
		Dog d=new Dog();
		d.talk();
		d.walk();

	}
	
	public void talk()
	{
		System.out.println("barks...");
	}

}
