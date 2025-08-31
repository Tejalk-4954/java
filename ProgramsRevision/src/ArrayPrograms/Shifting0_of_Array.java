package ArrayPrograms;

import java.util.Arrays;

public class Shifting0_of_Array {

	public static void main(String[] args) {

		int arr[]= {1,0,3,0,0,4,5,6};
		
		System.out.println("original Array::"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]!=0)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		
		System.out.println("Shifting Zeroes Last::"+Arrays.toString(arr));
 }
}
