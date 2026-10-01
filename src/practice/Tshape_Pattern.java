package practice;
import java.util.Scanner;
public class Tshape_Pattern 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two values one by one :- ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1 || j==3)
				{
					System.out.print(" @ ");
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
