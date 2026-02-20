package OOPs;

public class onlineLearningplatform {
	
	   public static void main(String[] args) {
		
		   course c1=new LiveCourse("java","mr.s",30,2,3,5000);
		   course c2=new recordedCourse("react","mr.m",40,3,5,4000);
		   
		   Student1 s1=new Student1("amit","premium");
		   Student1 s2=new Student1("riya","basic");
		   
		   if(c1.enrollStudent())
			   System.out.println(s1.name+" enrolled in "+c1.getTitle());
		   
		   if(c1.enrollStudent())
			   System.out.println(s2.name+" enrolled in "+c1.getTitle());
		   
		   s1.completeCourse(85, 88);
		   boolean completed=c1.checkcompletion(s1.attendance, s1.marks);
		   
		   if(completed)
			   System.out.println("certificate generated for:"+s1.name);
		   else
			   System.out.println("not completed!!!!");
		   
		   double revenue = c1.getEnrollment()*c1.calculatePrice("basic");
		   
		   System.out.println("total platform revenue::"+revenue);
	}	
	}

