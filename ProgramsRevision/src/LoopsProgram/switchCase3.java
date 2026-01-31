package LoopsProgram;

import java.util.Scanner;

public class switchCase3 {
 public static void main(String[] args) {
	
   Scanner sc=new Scanner(System.in);
   System.out.println("enter character");
   char ch=sc.next().charAt(0);
   
   switch(ch)
   {
     case 'a':case 'e':case 'i':case 'o':case 'u':
     case 'A':case 'E':case 'I':case 'O':case 'U':
    	 System.out.println("vowels");
    	 break;
    	 
     default:System.out.println("consonant"); 	 
   }
 }
}
