package ArrayPrograms;

import java.util.Scanner;

public class ArrayCubeAddition {
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
	
	int result=0;
	for(int i=0;i<size;i++)
	{
		result+=Math.pow(arr[i],3);
	}
	
	System.out.println(result);
}
}
