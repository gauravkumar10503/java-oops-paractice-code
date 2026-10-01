package practice;
import java.util.Scanner;
public class Reverse_Right_Triangle 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row value :- ");
		int r=sc.nextInt();
		
		System.out.print("Enter star value :- ");
		int star=sc.nextInt();
		
		int space=0;
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
			star--;
			space++;
		}
		sc.close();
	}
}
