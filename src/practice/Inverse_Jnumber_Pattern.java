package practice;
import java.util.Scanner;
public class Inverse_Jnumber_Pattern 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two values one by one :- ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		for(int i=r;i>=1;i--)
		{
			for(int j=c;j>=1;j--)
			{
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
