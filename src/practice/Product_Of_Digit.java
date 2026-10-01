package practice;
import java.util.Scanner;
public class Product_Of_Digit
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		
		int p=1;
		while(n!=0)
		{
			int l=n%10;
			p=p*l;
			n=n/10;
		}
		System.out.println("The product of digit is :- "+p);
		sc.close();
	}
}
