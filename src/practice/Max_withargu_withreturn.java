package practice;

public class Max_withargu_withreturn 
{
	public static void main(String[]args)
	{
		max(40,9);
	}
	public static int max(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a+" is greatest");
		}
		else
		{
			System.out.println(b+" is greatest");
		}
		return 1;
	}	
}
