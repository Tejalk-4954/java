package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class first {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter row size::");
	int row=sc.nextInt();
	
	System.out.println("Enter column size::");
	int column=sc.nextInt();
    
	int arr[][]=new int[row][column];
	
	System.out.println("enter array element");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	
	System.out.println(Arrays.deepToString(arr));
 }
}
