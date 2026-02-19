package OOPs;

public abstract class Student {
	

		private int[]marks;
		private String name;
		
		Student(String name,int []marks)
		{
			this.marks=marks;
			this.name=name;
		}
		
		public String getName()
		{
			return name;
		}
		
		public int[] getMarks()
		{
			return marks;
		}
		
		abstract void calculateResult();
		
	}


class Result extends Student
{

	Result(String name, int[] marks) {
		super(name, marks);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculateResult() {
		int total=0;
		
		boolean fail=false;
		
		int[] marks=getMarks();
		
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>=33 && marks[i]<35)
			{
				marks[i]=35;
			}
			
			if(marks[i]<35)
			{
				fail=true;
			}
		    
			total +=marks[i];
		}
		
		double percentage=(double)total/marks.length;
		
		String grade;
		
		if(percentage>=85)
		{
			grade="A+";
		}
		else if(percentage>=75)
		{
			grade="A";
		}
		else if (percentage >= 60)
            {
			grade = "B";
            }
        else if (percentage >= 50)
        {
        	grade = "C";
        }
        else if (percentage >= 40)
            {
        	grade = "D";
            }
        else
            grade = "Fail";
		
		System.out.println("Name:"+getName());
		System.out.println("Total:"+total);
		System.out.println("percentage:"+percentage);
		System.out.println("Grade:"+grade);
		
		
		if(fail)
			 System.out.println("Result:fail!!");
		else
			System.out.println("Result:Pass**");
		
		if(!fail && percentage>85)
			System.out.println("status::First class with Distinction");
		System.out.println("*************************************");
		
	}
	
}