package practice;

public class Pattern21 
{
	public static void main(String[]args)
	{
		int star=1;
		int space=8;
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print(" * ");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print("   ");
			}
			for(int l=1;l<=star;l++)
			{
				System.out.print(" * ");
			}
			if(i<=4)
			{
				star++;
				space-=2;
			}
			else
			{
				star--;
				space+=2;
			}
			System.out.println();
		}
	}
}
