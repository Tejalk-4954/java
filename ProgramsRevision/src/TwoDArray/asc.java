package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class asc {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of an array");
	int s=sc.nextInt();
	
	int arr[]=new int[s];
	System.out.println("enter array eleement:");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
//		for(int j=i+1;j<arr.length;j++)
//		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
//		}
//		 
	}
	System.out.println("max ="+max);
}
}
