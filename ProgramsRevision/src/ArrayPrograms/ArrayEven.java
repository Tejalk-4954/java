package ArrayPrograms;

import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size::");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter elements::");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("even elements of an array::");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
