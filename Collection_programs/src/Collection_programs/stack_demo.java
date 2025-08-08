package Collection_programs;

import java.util.Iterator;
import java.util.Stack;

public class stack_demo {

	public static void main(String[] args) {
		
		Stack<String> stack=new Stack<String>();
		stack.push("tejal");
		stack.push("Sakshi");
		stack.push("Kamini");
		stack.push("yamini");
		
		stack.pop();
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
