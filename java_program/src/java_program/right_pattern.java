package java_program;

public class right_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=5-i;j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}

	}

}
