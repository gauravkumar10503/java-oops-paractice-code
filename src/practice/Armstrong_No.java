package practice;
import java.util.Scanner;
public class Armstrong_No 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		int count=0;
		int t=n;
		while(t!=0)
		{
			t=t/10;
			count++;
		}
		System.out.println("The count of digit of given number :- "+count);
		t=n;
		int s=0;
		while(t!=0)
		{
			int f=1;
			int last=t%10;
			for(int i=1;i<=count;i++) 
			{
				f=last*f;
			}
			s=s+f;
			t=t/10;
		}
		System.out.println("The sum of digit of given number is :- "+s);
		
		if(s==n)
		{
			System.out.println("Given number is armstrong number ");
		}
		else
		{
			System.out.println("Given number is not a armstrong number ");
		}
		sc.close();
				
	}
}
