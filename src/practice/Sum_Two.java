package practice;
import java.util.Scanner;
public class Sum_Two 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two values one by one :- ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int s=0;
		for(int i=a;i<=b;i++)
		{
			s=s+i;
		}
		System.out.println("The sum of given two number is :- "+s);
		sc.close();
	}
}
