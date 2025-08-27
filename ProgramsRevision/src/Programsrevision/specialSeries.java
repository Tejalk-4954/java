package Programsrevision;

public class specialSeries {

	public static int calculateS(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else if(n==2)
		{
			return 2;
		}
		else
		{
			int sPrev2=1;
			int sPrev1=2;
			int sCurrent=0;
			
			for(int i=3;i<=n;i++)
			{
				sCurrent=2*sPrev1+sPrev2;
				sPrev2=sPrev1;
				sPrev1=sCurrent;
			}
			
			return sCurrent;
		}
	}
	
	public static long calculateF(int n)
	{
		long s_n=calculateS(n);
		long s_n_minus_1;
		
		if(n==1)
		{
			s_n_minus_1=1;
		}
		
		else {
			
			s_n_minus_1=calculateS(n-1);
		}
		
		return s_n*s_n+s_n_minus_1*s_n_minus_1;
	}
	
	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++)
		{
			System.out.println("f("+i+")="+calculateF(i));
			
			long avg=calculateF(i)/47;
			System.out.println(avg);
		}
		
		
		
	}
}
