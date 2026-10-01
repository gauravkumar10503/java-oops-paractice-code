package practice;
import java.util.Scanner;
public class Cross_Pattern 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values one by one :- ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==j || i+j==6)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
