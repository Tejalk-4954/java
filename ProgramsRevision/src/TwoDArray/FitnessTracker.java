package TwoDArray;

public class FitnessTracker {

	public static void main(String[] args) {
		
		int[] steps= {
				        12000,7000,8900,9000,13000,
				        14000,10000,10500,8500,9000,
				        16000,17000,8200,9500,7500
				      };
		
		
		int weeks=steps.length/7;
		
		for(int i=0;i<weeks;i++)
		{
			int total=0;
			for(int j=i*7;j<(i*7)+7;j++)
			{
				total +=steps[j];
			}
			
			double avg=total/7.0;
			
			if(avg>10000)
			{
				System.out.println("week "+(i+1)+" average exceeds 10000:"+avg);
			}
			
		}
		
		int totalSteps=0;
		
		for(int s:steps)
		{
			totalSteps +=s;
		}
		
		double calories=(totalSteps/1000.0)*40;
		System.out.println("total calories burned:"+calories);
		
		int maxStreak=0;
		int currentStreak=0;
		
		for(int s:steps)
		{
			if(s>8000)
			{
				currentStreak++;
				maxStreak=Math.max(maxStreak, currentStreak);
				
			}
			else
			{
				currentStreak=0;
			}
			
		}
		
		
		 System.out.println("Longest streak>8000 steps:"+maxStreak);
		
	}

}
