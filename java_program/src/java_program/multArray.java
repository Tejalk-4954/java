package java_program;

import java.util.Scanner;
public class multArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("array element::");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int mult=1;
		for(int i=0;i<size;i++)
		{
			mult*=arr[i];
		}
		System.out.println("multiplication of array element"+mult);
	}

}
