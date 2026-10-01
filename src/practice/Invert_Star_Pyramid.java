package practice;

public class Invert_Star_Pyramid 
{
	public static void main(String[]args)
	{
		int star=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=star;j--)
			{
				System.out.print(" * ");
			}
			star++;
			System.out.println();
		}
	}
}
