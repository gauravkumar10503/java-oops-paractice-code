package methods;

public class Non_Static_Mathoperation 
{
	public static void main(String[]args)
	{
		Maths m=new Maths();
		m.operation(5,9);
		m.operation(9.3,4);
	}
}

class Maths
{
	public void operation(int a,int b)
	{
		System.out.println("The sum of given number is :- "+(a+b));
	}
	public void operation(double a,double b)
	{
		System.out.println("The product of given number is :- "+(a*b));
	}
	public void operation(double a,int b)
	{
		System.out.println("The substraction of given number is :- "+(a-b));
	}
}
