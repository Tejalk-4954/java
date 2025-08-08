package inheritance;

public class husky extends Dog{

	public static void main(String[] args) {
     husky hs=new husky();
     hs.breed();
     hs.talk();
     hs.walk();
    }
	
	public static void breed()
	{
		System.out.println("hey i am husky dog");
	}

}
