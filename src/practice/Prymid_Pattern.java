package practice;
import java.util.Scanner;
public class Prymid_Pattern 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter one value :- ");
		int r=sc.nextInt();
		
		System.out.print("Enter the space value :- ");
		int space=sc.nextInt();
		int star=1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			space--;
			star+=2;
		}
		sc.close();
	}
}
