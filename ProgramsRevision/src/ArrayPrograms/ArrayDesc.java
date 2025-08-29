package ArrayPrograms;

import java.util.Scanner;

public class ArrayDesc {

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
        
        System.out.println("Array in Descending order::");
        for(int i=0;i<size;i++)
        {
        	for(int j=i+1;j<size;j++)
        	{
        		if(array[i]<array[j])
        		{
        			int temp=array[i];
        			array[i]=array[j];
        			array[j]=temp;
        		}
        	}
        	System.out.println(array[i]);
        }
	}

}
