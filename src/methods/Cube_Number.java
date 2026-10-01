package methods;
import java.util.Scanner;
public class Cube_Number 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int x=sc.nextInt();
		cube(x);
		sc.close();
	}
	public static void cube(int i)
	{
		int c=i*i*i;
		System.out.println("The cube of given number is :- "+c);
	}
}
