package TwoDArray;

public class WarehouseSystem {

	public static void main(String[] args) {
		
		int[][] inventory= {
				{50,20,30},
				{10,40,20},
				{60,10,25}
		};
		
		int categories=inventory.length;
		int locations=inventory[0].length;
		
		int minTotal=Integer.MAX_VALUE;
		
		int minLocIndex=-1;
		
		for(int j=0;j<locations;j++)
		{
			int locationTotal=0;
			for(int i=0;i<categories;i++)
			{
				locationTotal +=inventory[i][j];
			}
			
			System.out.println("Location"+j+"total stock:"+locationTotal);
			if(locationTotal<minTotal)
			{
				minTotal=locationTotal;
				
				minLocIndex=j;
			}
		}
		
		System.out.println("Location with minimum stock:"+minLocIndex);
		System.out.println("average stock per location:"+(double)minTotal/locations);
	}

}
