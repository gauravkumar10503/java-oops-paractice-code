package practice;

public class Pattern24 
{
	public static void main(String[]args)
	{
		int star=1;
		int space=10;
		
		for(int i=0;i<=10;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("  * ");
			} 
			if(i<=4)
			{
				star++;
				space--;
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
