package IntegerPrograms;

public class SwappingNo {

	public static void main(String[] args) {
		int a=12;
		int b=15;
		
		System.out.println("before Swapping:"+"a="+a+" "+"b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping:"+"a="+a+" "+"b="+b);
	}
}
