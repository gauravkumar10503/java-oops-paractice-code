package practice;
import java.util.Scanner;
public class Sum_OF_Digit2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		
		int sum=0;
		while(n!=0)
		{
			int last=n%10;
			sum=sum+last;
			n=n/10;
		}
		System.out.println("The sum of digit is :- "+sum);
		sc.close();
	}
}
