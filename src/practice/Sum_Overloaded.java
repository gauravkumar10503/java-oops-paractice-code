package practice;

public class Sum_Overloaded 
{
	public static void main(String[]args)
	{
		sum(10,5);
		sum(10.4,9.4);
		sum(10,12,18);
	}
	public static void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println("The sum of two given number is :- "+sum);
	}
	public static void sum(double c,double d)
	{
		double sum=c+d;
		System.out.println("The sum of two given number(decimal) is :- "+sum);
	}
	public static void sum(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("The sum of three given number is :- "+sum);
	}
}
