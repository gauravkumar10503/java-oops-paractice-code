package array_with_function;

import java.util.Arrays;
public class Transpose_Of_2d_Array 
{
	public static void transpose(int [][]x)
	{
		for(int i=0;i<=x.length-1;i++)
		{
			for(int j=0;j<=x[i].length-1;j++)
			{
				if(i>=j)
				{
					int temp=x[i][j];
					x[i][j]=x[j][i];
					x[j][i]=temp;
				}
			}
		}
		System.out.print("Transpose of 2d array :- "+Arrays.deepToString(x));
	}
	public static void main(String []args)
	{
		int [][]a= {{1,2},{3,4}};
		transpose(a);
	}
}
