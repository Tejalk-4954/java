package java_program;

 class circle extends shape {
	
	double r=3,pi=3.14;
	void calculateArea()
	{
		double area=pi*r*r;
		System.out.println("area of circle"+area);
		
	}
	
	void calculatePerimeter()
	{
	   double perimeter=2*pi*r;
	   System.out.println("perimeter of circle"+perimeter);
		
	}

}
