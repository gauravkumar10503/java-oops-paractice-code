package practice;
import java.util.Scanner;
public class Strong_Number 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		
		int t=n;
		int s=0;
		while(t!=0)
		{
			int f=1;
			int l=t%10;
			for(int i=1;i<=l;i++)
			{
				f=f*i;
			}
			s=s+f;
			t=t/10;
		}
		System.out.println("Sum of number is :- "+s);
		if(s==n)
		{
			System.out.println("Given number is strong number ");
		}
		else
		{
			System.out.println("Given number is not a strong number ");
		}
		sc.close();
	}
}
