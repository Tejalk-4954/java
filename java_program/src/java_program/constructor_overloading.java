package java_program;

public class constructor_overloading {
	
	    int pages;
	    String title;
	    String author;
	    float price;


	    constructor_overloading()
	    {
	       pages=0;
	       title="xyz";
	       author="abc";
	       price=0;
	    }

	    constructor_overloading(int p,String t,String a,float r)
	     {
	        pages=p;
	        title=t;
	        author=a;
	        price=r;
	     }


	    void display()
	    {
	       System.out.println("Book title="+title);
	       System.out.println("Book author="+author);
	       System.out.println("Book pages="+pages);
	       System.out.println("Book price="+price);

	    }

	   public static void main(String [] args)
	   {
		   constructor_overloading b1=new constructor_overloading();
		   constructor_overloading b2=new constructor_overloading(450,"java","david",60);
	        b1.display();
	        b2.display();
	   }
	}
	

