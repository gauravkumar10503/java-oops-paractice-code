package practice;
import java.util.Scanner;
public class Count_Factor2 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your value :- ");
		int n=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println("The factor of given number is :- "+count);
		sc.close();
	}
}
