package ArrayPrograms;import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElements {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr size of array");
	int s=sc.nextInt();
	
	int arr[]=new int[s];
	
	System.out.println("enter array ele:");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}

	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("duplicate ::"+arr[i]);
			}
		}
	}
}
}
