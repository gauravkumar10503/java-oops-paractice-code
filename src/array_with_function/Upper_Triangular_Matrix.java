package array_with_function;

import java.util.Arrays;
public class Upper_Triangular_Matrix 
{
	public static void upper(int [][]x)
	{
		for(int i=0;i<=x.length-1;i++)
		{
			for(int j=0;j<=x[i].length-1;j++)
			{
				if(i<=j)
				{
					x[i][j]=0;
				}
			}
		}
		System.out.print("Upper triangular matrix :- "+Arrays.deepToString(x));
	}
	public static void main(String []args)
	{
		int [][]a= {{1,2,3},{4,5,6}};
		upper(a);
	}
}
