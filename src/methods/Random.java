package methods;

public class Random 
{
	public static void main(String[]args)
	{
		random();
	}
	public static double random()
	{
		double a=Math.random();
		System.out.println(a*101);
		return a;
	}
}
