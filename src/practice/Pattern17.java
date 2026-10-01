package practice;

public class Pattern17 
{
	public static void main(String[]args)
	{
		int star=1;
		int space=4;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(" * ");
			}
			for(int l=1;l<=space;l++)
			{
				System.out.print("   ");
			}
			if(i<=4)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
			System.out.println();
		}
	}
}
