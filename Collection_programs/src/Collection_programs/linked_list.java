package Collection_programs;
import java.util.LinkedList;
public class linked_list {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(12);
		l1.add(23);
		l1.add(45);
		System.out.println(l1.size());
		System.out.println(l1.remove(2));
		System.out.println(l1.get(0));
		System.out.println(l1);
		
		
		
	}

}
