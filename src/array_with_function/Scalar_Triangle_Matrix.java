package array_with_function;

import java.util.Arrays;
import java.util.Scanner;
public class Scalar_Triangle_Matrix 
{
	public static void scalar(int [][]x)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of k :- ");
		int k=sc.nextInt();
		
		for(int i=0;i<=x.length-1;i++)
		{
			for(int j=0;j<=x[i].length-1;j++)
			{
				x[i][j]*=k;
			}
		}
		System.out.print("Scalar triangle matrix :- "+Arrays.deepToString(x));
		sc.close();
	}
	public static void main(String []args)
	{
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		scalar(a);
	}
}
