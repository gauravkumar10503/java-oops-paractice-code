package array_with_function;

import java.util.Arrays;
public class Interchange_Array 
{
	public static void interchange(int [][]x)
	{
		int right=0;
		int left=x[0].length-1;
		for(int i=0;i<=x.length-1;i++)
		{
			int temp=x[i][left];
			x[i][left]=x[i][right];
			x[i][right]=temp;
		}
		System.out.print("After interchange of the matrix :- "+Arrays.deepToString(x));
	}
	public static void main(String []args)
	{
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		interchange(a);
	}
}
