package OOPs;

public class StudentmarksSystem {
public static void main(String[] args) {
	
	String []names= {"tej","sej","raj"};
	
	int [] [] allmarks= {
			{88,99,76,89,80},
			{60,34,55,40,70},
			{92,81,86,89,94}
	};
	
	Result[] students=new Result[names.length];
	
	double highestPercentage=0;
	String topper = null;
	int PassCount=0;
	
	System.out.println("=========Student result report=============");
	
	for(int i=0;i<names.length;i++)
	{
		students[i]=new Result(names[i],allmarks[i]);
		students[i].calculateResult();
		
		int total=0;
		boolean fail=false;
		
		for(int j=0;j<allmarks[i].length;j++)
		{
			if(allmarks[i][j]<35)
				fail=true;
			total +=allmarks[i][j];
		}
		
		double percentage=(double)total/allmarks[i].length;
		
		if(!fail)
			PassCount++;
		
		if(!fail && percentage>highestPercentage)
		{
			highestPercentage=percentage;
		    topper=names[i];
		}
	}
	
	System.out.println("===== OVERALL STATISTICS =====");
    System.out.println("Topper: "+ topper);
    System.out.println("Highest Percentage: " + highestPercentage);
    System.out.println("Pass Percentage: " +
            ((double) PassCount / names.length) * 100 + "%");
	
}
}
