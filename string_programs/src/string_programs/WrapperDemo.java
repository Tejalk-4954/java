package string_programs;

public class WrapperDemo {
	
	public static void main(String[] args) {
		int a=20;
		Integer i=Integer.valueOf(a); //autoboxing
		Integer j=a;
		System.out.println(a+" "+i+" "+j);
	}

}
