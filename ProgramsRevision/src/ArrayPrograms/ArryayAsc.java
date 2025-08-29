package ArrayPrograms;

import java.util.Scanner;

public class ArryayAsc {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array::");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("enter elements of an array::");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array in Ascending order::");
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{	
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			
			System.out.println(arr[i]);
		}
	}
}
