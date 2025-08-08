package string_programs;

public class string_demo {

	public static void main(String[] args) {
		String s="sachin";
		
		s=s.concat(" tendulkar");
		System.out.println(s);
        s=s.toUpperCase();	
        System.out.println(s);
        s=s.toLowerCase();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(7));
        char[] ch= {'t','e','j','a','l'}; //converting char into string using valueof()method
        System.out.println(String.valueOf(ch));
	}
	

}
