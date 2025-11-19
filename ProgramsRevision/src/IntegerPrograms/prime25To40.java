package IntegerPrograms;

public class prime25To40 {

	public static void main(String[] args) {

		for(int num=25;num<=40;num++)
		{
			boolean isprime=true;
			
			if(num<2)
			{
				isprime=false;
			}
			else
			{
				for(int i=2;i<num;i++)
				{
					if(num%i==0)
					{
						isprime=false;
						break;
					}
						
				}
			}
			
			if(isprime)
			{
				System.out.println(num+" ");
			}
		}
	}

}
