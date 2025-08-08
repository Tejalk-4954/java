package Collection_programs;

import java.util.ArrayList;
import java.util.HashSet;


public class ArrayList_duplicateElements {

	public static void main(String[] args) {
	ArrayList<Integer> arr=new ArrayList<Integer>();//creating Arraylist
	arr.add(45);//adding elemnets to arraylist
	arr.add(67);
	arr.add(45);
	arr.add(78);
	arr.add(17);
	arr.add(78);
	arr.add(15);
	
	System.out.println("arrayList with duplicate elements::"+arr);
	
	HashSet<Integer> set =new HashSet<>(arr); //convert the ArrayList  into HashSet
	ArrayList<Integer> arr1=new ArrayList<Integer>(set);// Create a new ArrayList from the HashSet
	System.out.println("arrayList without duplicate elements::"+arr1);

	}

}
