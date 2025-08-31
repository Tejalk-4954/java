package StringPrograms;

public class reverseString {
public static void main(String[] args)
{
	String str="tejal";
	String rev=" ";
	System.out.println("original String::"+str);
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	
	System.out.println("reverse String::"+rev);
	
}
}
