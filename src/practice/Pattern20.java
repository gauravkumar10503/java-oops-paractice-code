package practice;

public class Pattern20 
{
	public static void main(String[]args)
	{
		int star=9;
		int space=0;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(" * ");
			}
			if(i<=4)
			{
				star-=2;
				space++;
			}
			else
			{
				star+=2;
				space--;
			}
			System.out.println();
		}
	}
}
