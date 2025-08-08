package java_program;
import java.util.Scanner;
public class MaxArray {

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
		int max=arr[0];
		for(int i=1;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
