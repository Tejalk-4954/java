package StringPrograms;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String to check::");
		String str=sc.next();
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
			
		}
		
		if(str.equals(reverse))
		{
			System.out.println(str+": is a palindrome ");
		}
		else
		{
			System.out.println(str+": not a palindrome");
		}
		
	}

	   
//	    public static boolean isPalindrome(String s) {
//	      
//	       
//	        s = s.toLowerCase();
//
//	        
//	        String rev = "";
//	        for (int i = s.length() - 1; i >= 0; i--) {
//	            rev = rev + s.charAt(i);
//	        }
//
//	        
//	        return s.equals(rev);
//	    }
//
//	    public static void main(String[] args) {
//	      
//	       
//	        String s = "";
//
//	        boolean res = isPalindrome(s);
//
//	        
//	        if (res) {
//	            System.out.println('"' + s + '"' + " is a palindrome.");
//	        } else {
//	            System.out.println('"' + s + '"' + " is not a palindrome.");
//	        }
//	        }
	    }

