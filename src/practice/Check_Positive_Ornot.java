package practice;

public class Check_Positive_Ornot 
{
	public static void main(String[]args)
	{
		check(-9);
	}
	public static int check(int a)
	{
		if(a>=1)
		{
			System.out.println("Given numbe  is positive");
		}
		else if(a<0)
		{
			System.out.println("Given numbe  is negetive");
		}
		else
		{
			System.out.println("0 is netural number ");
		}
		return a;
	}
}
