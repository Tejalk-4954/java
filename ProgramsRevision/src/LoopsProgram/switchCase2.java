package LoopsProgram;

import java.util.Scanner;

public class switchCase2 {
 public static void main(String[] args) {
   
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter 1st integer");
	 int a=sc.nextInt();
	 
	 System.out.println("enter 2nd integer");
	 int b=sc.nextInt();
	 
	 System.out.println("enter any operator +,-,*,/");
	 char op=sc.next().charAt(0);
	 
	 switch(op)
	 {
	 case '+': System.out.println("result=="+(a+b));
	           break;
	           
	 case '-': System.out.println("result=="+(a-b));
     break;
     
	 case '*': System.out.println("result=="+(a*b));
     break;
     
	 case '/': System.out.println("result=="+(a/b));
     break;
     
     default:System.out.println("invalid operator");
	 }
	 
 }
}
