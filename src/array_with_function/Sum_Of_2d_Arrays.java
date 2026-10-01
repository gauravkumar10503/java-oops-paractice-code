package array_with_function;

import java.util.*;
public class Sum_Of_2d_Arrays 
{
	public static void sum(int [][]x,int [][]y)
	{
		int [][]c=new int[3][2];
		for(int i=0;i<=c.length-1;i++)
		{
			for(int j=0;j<=c[i].length-1;j++)
			{
				c[i][j]=x[i][j]+y[i][j];
			}
		}
		System.out.print("Sum of 2d arrays :- "+Arrays.deepToString(c));
	}
	public static void main(String []args)
	{
		int [][]a= {{1,2},{3,4},{5,6}};
		int [][]b= {{1,2},{3,4},{5,6}};
		sum(a,b);
	}
}
