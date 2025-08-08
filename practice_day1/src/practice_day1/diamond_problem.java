package practice_day1;

//Interface ,ambiguity problem

public class diamond_problem 
{

	public static void main(String[] args) {
		
		problem pb = new problem();
		pb.fun();
		  
	}
}


interface parent1 {
	void fun();
}

interface parent2{
	void fun();
}


class problem implements parent1,parent2 {

	@Override
	public void fun() {
		System.out.println("have a fun");
		
	}
	
	
}

