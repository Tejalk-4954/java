package Programsrevision;

public class ArmStrong {

	public static void main(String[] args) {
		
		int number=153,remainder,result=0;
		int original_no=number;
		
		while(original_no!=0)
		{
			remainder=original_no%10;
			result+=Math.pow(remainder, 3);
			original_no/=10;
		}
		
		if(result==number)
		{
			System.out.println("ArmStrong no");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}
