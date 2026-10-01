package practice;

public class Pattern9 
{
	public static void main(String[]args)
	{
		char a='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" "+a+" ");
				a++;
			}
			System.out.println();
		}
	}
}
