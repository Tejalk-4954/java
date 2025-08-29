package ArrayPrograms;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size::");
		int size = sc.nextInt();
		
		int arr[]=new int[size];
        
		System.out.println("enter array elements::");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum+=arr[i];
		}
         
		System.out.println("Sum of Array Elements::"+sum);
	}
}
