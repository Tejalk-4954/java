package java_program;

public class construct {
	String languages;
	public construct() {
		System.out.println("hello");
	}

	 public construct(String lang) {
		
		languages=lang ;
		System.out.println("programming languages::"+languages);
	 }
	 
	 
	public static void main(String[] args) 
	{
		construct c=new construct("java");
		construct c1=new construct("c++");
		}

}
