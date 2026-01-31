package TwoDArray;

import java.util.Arrays;

public class AddTwoMatrices {
public static void main(String[] args) {
	
	int[][] one= {
			{1,2,3},
			{4,5,6}
	};
	
	
	int[][] two= {
			{7,8,9},
			{10,11,12}
	};
	
	int rows=one.length;
	int columns=one[0].length;
	
	int [][] sumMatrix=new int[rows][columns];
	
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			sumMatrix[i][j]=one[i][j]+two[i][j];
		}
	}
	
	System.out.println("after Addition::");
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			System.out.println(sumMatrix[i][j]+" ");
		}
		System.out.println();
	}
	
//	System.out.println(Arrays.deepToString(sumMatrix));
  }
}
