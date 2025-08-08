package java_program;

 class triangle extends shape {
	 
	 double b=4,h=6,side1=12,side2=12,side3=12;
		 
		 void calculateArea()
		 {
			 double area=0.5*b*h;
			 System.out.println("Area of triangle:"+area);
			 
		 }
		 void calculatePerimeter()
		 {
			 double perimeter=side1+side2+side3;
			 System.out.println("perimeter of triangle:"+perimeter);
		 }
		
		
	}



