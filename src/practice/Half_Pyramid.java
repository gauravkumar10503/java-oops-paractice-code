package practice;

import java.util.Scanner;
public class Half_Pyramid 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row value :- ");
		int r=sc.nextInt();
		
		int space=4;
		int star=1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print(" * ");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print("   ");
			}
			System.out.println();
			space--;
			star++;
		}
		sc.close();
	}
}
