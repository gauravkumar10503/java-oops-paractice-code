package practice;

public class Square_withargu_withreturn 
{
	public static void main(String[]args)
	{
		square(5);
	}
	public static int square(int a)
	{
		int sq=a*a;
		System.out.println("The Square of given number "+a+" is :- "+sq);
		return sq;
	}
}
