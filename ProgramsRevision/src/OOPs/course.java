package OOPs;

public abstract class course {

	
	protected String title;
	protected String instructor;
	protected int duration;
	protected int capacity;
    protected int enrolled = 0;
    protected double basePrice;
    
	public course(String title, String instructor, int duration, int capacity, int enrolled, double basePrice) {
		super();
		this.title = title;
		this.instructor = instructor;
		this.duration = duration;
		this.capacity = capacity;
		this.enrolled = enrolled;
		this.basePrice = basePrice;
	}

	
	public boolean enrollStudent()
	{
	  if(enrolled<capacity)
	  {
		  enrolled++;
		  return true;
	  }
	  return false;
	}
	
	public abstract double calculatePrice(String membership);
	public abstract boolean checkcompletion(int attendance,int marks);
	
	public String getTitle()
	{
		return title;
	}
	
	public int getEnrollment()
	{
		return enrolled;
	}
}


class LiveCourse extends course
{

	public LiveCourse(String title, String instructor, int duration, int capacity, int enrolled, double basePrice) {
		super(title, instructor, duration, capacity, enrolled, basePrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePrice(String membership) {
		double price=basePrice+500;
		if(membership.equals("premium"))
			price *=0.9;
		
		return price;
	}

	@Override
	public boolean checkcompletion(int attendance, int marks) {
		
		return attendance>=75 && marks>=50;
	}
	
}

class recordedCourse extends course
{

	public recordedCourse(String title, String instructor, int duration, int capacity, int enrolled, double basePrice) {
		super(title, instructor, duration, capacity, enrolled, basePrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePrice(String membership) {
		double price =basePrice;
		if(membership.equals("premium"))
			price *=0.85;
		return price;
	}

	@Override
	public boolean checkcompletion(int attendance, int marks) {
		return marks>=50;
	}
	
}


class Student1
{
    String name;
    String membership;
    int attendance;
    int marks;
    
    
    public Student1(String  name, String membership)
    {
    	this.membership=membership;
    	this.name=name;
    }
    
    public void completeCourse(int attendance,int marks)
    {
    	this.attendance=attendance;
    	this.marks=marks;
    }
}



//class onlineLearningPlatform
//{
//   public static void main(String[] args) {
//	
//	   course c1=new LiveCourse("java","mr.s",30,2,3,5000);
//	   course c2=new recordedCourse("react","mr.m",40,3,5,4000);
//	   
//	   Student1 s1=new Student1("amit","premium");
//	   Student1 s2=new Student1("riya","basic");
//	   
//	   if(c1.enrollStudent())
//		   System.out.println(s1.name+" enrolled in "+c1.getTitle());
//	   
//	   if(c1.enrollStudent())
//		   System.out.println(s2.name+" enrolled in "+c1.getTitle());
//	   
//	   s1.completeCourse(65, 88);
//	   boolean completed=c1.checkcompletion(s1.attendance, s1.marks);
//	   
//	   if(completed)
//		   System.out.println("certificate generated for:"+s1.name);
//	   else
//		   System.out.println("not completed!!!!");
//	   
//	   double revenue = c1.getEnrollment()*c1.calculatePrice("basic");
//	   
//	   System.out.println("total platform revenue::"+revenue);
//}	
//}