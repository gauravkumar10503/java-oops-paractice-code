package practice;
import java.util.Scanner;
public class Reverse_Prymid_Pattern 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row value :- ");
		int r=sc.nextInt();
		
		System.out.print("Enter the value of stars :- ");
		int star=sc.nextInt();
		int space=1;
		
		for(int i=1;i<=r;i++)
		{
			for(int j=space;j>=1;j--)
			{
				System.out.print("   ");
			}
			for(int k=star;k>=1;k--)
			{
				System.out.print(" * ");
			}
			System.out.println();
			star-=2;
			space++;
		}
	}
}
