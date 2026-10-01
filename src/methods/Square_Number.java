package methods;
import java.util.Scanner;
public class Square_Number 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int c=sc.nextInt();
		square(c);
		sc.close();
	}
	public static int square(int i)
	{
		int s=i*i;
		System.out.println("The square of given number is :- "+s);
		return s;
	}
}
