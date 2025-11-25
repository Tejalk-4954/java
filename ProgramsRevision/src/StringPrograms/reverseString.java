package StringPrograms;

import java.util.Scanner;

public class reverseString {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any String>>");
	String str=sc.nextLine();
	
	System.out.println("original String is::"+str);
	String rev=" ";
	
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	
	System.out.println("reversed String::"+rev);
}
}
