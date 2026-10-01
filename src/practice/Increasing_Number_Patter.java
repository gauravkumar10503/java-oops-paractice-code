package practice;
import java.util.Scanner;
public class Increasing_Number_Patter 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two values one by one :- ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int x=1;
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print(" "+x+" ");
				x++;
			}
			System.out.println();
		}
		sc.close();
	}
}
