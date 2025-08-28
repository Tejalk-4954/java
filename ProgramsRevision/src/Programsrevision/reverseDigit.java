package Programsrevision;

public class reverseDigit {

	 public static void main(String[] args) {
		int num=1234 ,rev=0;
		int digit;
		
		System.out.println("Original No::"+num);
		
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}
	System.out.println("reverse Number::"+rev);
	}
	 
}
