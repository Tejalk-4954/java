package ArrayPrograms;

import java.util.Scanner;

public class SecondLargest {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
    System.out.println("enter size::");
    int size=sc.nextInt();	
    
   int array[]=new int[size];
    
    System.out.println("enter elements of an Array::");
    for(int i=0;i<size;i++)
    {
    	array[i]=sc.nextInt();
    }
    
    int max=0;
    int Second_highest=0;
    
    for(int i=0;i<size;i++)
    {
    	if(array[i]>max)
    	{
    		Second_highest=max;
    		max=array[i];
    	}
    	
    }
    System.out.println("second highest element of Array::"+Second_highest);
}
}
