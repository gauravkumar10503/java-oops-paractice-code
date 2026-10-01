package practice;
import java.util.Scanner;
public class Matrix_Basic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of  rows and columns :- ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][]a=new int[r][c];
		System.out.println("Enter the elements of matrix :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		// int [] []a={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Given matrix is :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
