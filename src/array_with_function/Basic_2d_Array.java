package array_with_function;

import java.util.*;
public class Basic_2d_Array 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of row and column one be one :- ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int [][]a=new int[r][c];
		System.out.print("Enter the element of the matrix :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("The Matrix :- "+Arrays.deepToString(a));
		sc.close();
	}
}
