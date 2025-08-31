package ArrayPrograms;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		int arr[]= {12,56,88,99};
		System.out.println("original Array::"+Arrays.toString(arr));
		Reversearray(arr);
		System.out.println("Reverse Array::"+Arrays.toString(arr));

		
	}

	public static void Reversearray(int[] arr) {
		
		int left=0;
		int right=arr.length-1;
		
		 while(left<right)
		 {
			 int temp= arr[left];
			 arr[left]=arr[right];
			 arr[right]=temp;
			 
			 left++;
			 right--;
		 }
		
	}

}
