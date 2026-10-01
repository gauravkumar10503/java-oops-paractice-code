package practice;
import java.util.Scanner;
public class Kmconvert 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter kmh values :- ");
		double kms=sc.nextDouble();
		
		double c=kms*0.27;
		System.out.println("The convert kmh in ms is :- "+c);
		sc.close();
		
	}
}
